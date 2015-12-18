package yarmark.contactList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.swing.JList;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class InternetThread extends Thread {

	private JList<String> jList;
	private Contact[] contacts;

	public InternetThread(JList<String> jList) throws IOException {
		this.jList = jList;
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

			StringBuilder buildName = null;

			String[] contactNames = new String[contacts.length];

			for (int i = 0; i < contactNames.length; i++) {

				buildName = new StringBuilder();
				String[] tempName = contacts[i].getName().split(" ");

				for (int j = tempName.length - 1; j >= 0; j--) {
					if (tempName[j].length() == 1) {
						//for middle initials and suffix title such as III, Esq. etc
						buildName.append(tempName[j - 1]);
						buildName.append(" ");
						buildName.append(tempName[j - 2]);
						buildName.append(" ");
						buildName.append(tempName[j]);						
						break;
					}
					buildName.append(tempName[j]);
					buildName.append(" ");
				}
				contactNames[i] = buildName.toString();

			}
			Arrays.sort(contactNames);
			jList.setListData(contactNames);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
