package yarmark.NYPL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class ImageInternetThread extends Thread implements ActionListener {

	private String url;
	private JLabel icon;
	private Capture[] captures;
	private JButton next;
	private JButton previous;
	private JLabel number;
	private int currentPic;

	public ImageInternetThread(String url, JLabel icon, JButton previous, JButton next, JLabel number) {
		this.url = url;
		this.icon = icon;
		this.previous = previous;
		this.next = next;
		this.number = number;
	}

	public void run() {

		URL url;
		try {
			url = new URL(this.url);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Authorization", "Token token=\"rzzebrrr5y4mv85a\"");
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			JsonReader reader = new JsonReader(in);
			Gson gson = new Gson();
			MainAPIholder searchResults = gson.fromJson(reader, MainAPIholder.class);

			// pictures for this choice
			captures = searchResults.getAPI().getResponse().getCapture();

			currentPic = 0;
			number.setText((currentPic + 1) + "/" + captures.length);
			previous.setEnabled(false);
			if ((captures.length - 1) > 0) {
				next.setEnabled(true);
			}

			next.addActionListener(this);
			previous.addActionListener(this);
			showPicture(currentPic);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void showPicture(int index) throws IOException {
		BufferedImage bufferedImage = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);

		// links for 1 pic of the choices (different res)
		ImageLinks links = captures[index].getImageLinks();
		String picURL = links.getImageLink();
		bufferedImage = ImageIO.read(new URL(picURL));

		ImageIcon image = new ImageIcon(bufferedImage);

		icon.setIcon(image);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == next) {
			try {
				showPicture(++currentPic);
				number.setText((currentPic + 1) + "/" + captures.length);
				if (currentPic == captures.length - 1) {
					next.setEnabled(false);
				}
				if (currentPic > 0) {
					previous.setEnabled(true);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == previous) {
			try {
				showPicture(--currentPic);
				number.setText((currentPic + 1) + "/" + captures.length);
				if (currentPic == captures.length - 2) {
					next.setEnabled(true);
				}
				if (currentPic == 0) {
					previous.setEnabled(false);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
