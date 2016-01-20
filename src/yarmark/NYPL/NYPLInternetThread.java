package yarmark.NYPL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class NYPLInternetThread extends Thread {

	private NYPLJFrame mainFrame;
	private String searchItem;
	private DefaultListModel<String> model;
	private JList<String> resultsJList;

	public NYPLInternetThread(NYPLJFrame mainFrame, String searchItem, JList<String> results,
			DefaultListModel<String> model) {
		this.mainFrame = mainFrame;
		this.searchItem = searchItem;
		this.model = model;
		this.resultsJList = results;
	}

	public void run() {
		URL url;
		try {
			url = new URL("http://api.repo.nypl.org/api/v1/items/search?q=" + this.searchItem
					+ "&publicDomainOnly=true");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Authorization", "Token token=\"rzzebrrr5y4mv85a\"");
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			JsonReader reader = new JsonReader(in);
			Gson gson = new Gson();
			MainAPIholder searchResults = gson.fromJson(reader, MainAPIholder.class);

			Result[] results = searchResults.getAPI().getResponse().getResult();
			mainFrame.setResult(results);
			for (Result i : results) {
				if (i.getTitle().length() > 30) {
					String title = i.getTitle().substring(0, 29);
					model.addElement(title);
				} else {
					model.addElement(i.getTitle());
				}
			}
			resultsJList.setModel(model);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
