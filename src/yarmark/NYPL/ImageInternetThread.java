package yarmark.NYPL;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class ImageInternetThread extends Thread {

	private String url;
	private JLabel icon;

	public ImageInternetThread(String url, JLabel icon) {
		this.url = url;
		this.icon = icon;
	}

	public void run() {

		URL url;
		try {
			url = new URL(this.url);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			JsonReader reader = new JsonReader(in);
			Gson gson = new Gson();
			MainAPIholder searchResults = gson.fromJson(reader, MainAPIholder.class);

			BufferedImage bufferedImage = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);
			bufferedImage = ImageIO.read(url);

			ImageIcon image = new ImageIcon(bufferedImage);

			icon.setIcon(image);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
