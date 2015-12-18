package yarmark.contactList;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class ContactJFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	JList<String> jList;

	public ContactJFrame() {
		setTitle("Contacts");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		// estimate size to intialize
		jList = new JList<String>();

		InternetThread thread;
		try {
			thread = new InternetThread(jList);
			thread.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		jList.setLayoutOrientation(JList.VERTICAL_WRAP);
		jList.setVisibleRowCount(-1);
		
		add(jList, BorderLayout.CENTER);
		getContentPane();
	}
}
