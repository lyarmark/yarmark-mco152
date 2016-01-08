package yarmark.chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import org.eclipse.jetty.server.Server;

public class ChatUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private JTextArea textArea;
	private JPanel panel;
	private JTextField textField;
	private JButton button;

	public ChatUI() {
		setTitle("Chat");
		setSize(500, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = getContentPane();
		setLayout(new BorderLayout());
		
		this.textArea = new JTextArea();
		this.panel = new JPanel();
		this.textField = new JTextField();
		this.button = new JButton("Send");
		
		JScrollPane pane = new JScrollPane(textArea);
		pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		panel.add(textField);
		panel.add(button);

		// textArea.setBackground(Color.cyan);

		this.textArea.setPreferredSize(new Dimension(500, 370));
		this.textField.setPreferredSize(new Dimension(250, 30));
		this.panel.setPreferredSize(new Dimension(500, 30));

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				URL url;
				try {
					url = new URL("http://192.168.117.111:8080");
					HttpURLConnection connection = (HttpURLConnection) url.openConnection();
					connection.setDoOutput(true);
					OutputStream out = connection.getOutputStream();
					PrintWriter writer = new PrintWriter(out);
					textArea.append("\n" + textField.getText());
					writer.println("\n" + textField.getText() + "\n");
					writer.flush();
					textField.setText("");
					// know you're ready to send when you're ready to receive
					connection.getInputStream();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});

		add(pane, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);

		Server server = new Server(8080);
		server.setHandler(new ChatP2PHandler(this.textArea));

		try {
			server.start();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		getContentPane();
	}
}
