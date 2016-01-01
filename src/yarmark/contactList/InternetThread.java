package yarmark.contactList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class InternetThread extends Thread {

	private JList<Contact> jList;
	private Contact[] contacts;
	private DefaultListModel<Contact> model;

	public InternetThread(JList<Contact> jList, DefaultListModel<Contact> model) throws IOException {
		this.jList = jList;
		this.model = model;
	}

	public void run() {

		URL url;
		try {
			url = new URL("http://jsonplaceholder.typicode.com/users");

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			JsonReader reader = new JsonReader(in);
			Gson gson = new Gson();

			contacts = gson.fromJson(reader, Contact[].class);
			Arrays.sort(contacts);

			for (Contact c : contacts) {
				model.addElement(c);
			}

			this.jList.setModel(model);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
