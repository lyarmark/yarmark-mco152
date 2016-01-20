package yarmark.NYPL;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class NYPLJFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JPanel searchPanel;
	private JTextField searchField;
	private JButton searchButton;

	private JPanel previousNext;
	private JButton previous;
	private JButton next;
	private JLabel number;

	private JPanel resultsPanel;
	private JList<String> resultsJList;
	private DefaultListModel<String> model;

	private JPanel picturePanel;
	private JLabel icon;

	private Result[] result;

	public NYPLJFrame() {
		setTitle("New York Public Library");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = getContentPane();
		setLayout(new BorderLayout());

		setLayout();

		this.searchButton.addActionListener(this);

		resultsJList.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent le) {
				int index = resultsJList.getSelectedIndex();
				String temp = result[index].getAPIItemURL();
				ImageInternetThread imageThread = new ImageInternetThread(result[index].getAPIItemURL(), icon,
						previous, next, number);
				imageThread.start();
			}
		});
		getRootPane().setDefaultButton(searchButton);
		getContentPane();
	}

	public void setLayout() {
		this.previousNext = new JPanel();
		this.previous = new JButton("Previous");
		this.next = new JButton("Next");
		this.number = new JLabel();
		this.previousNext.add(previous, BorderLayout.SOUTH);
		this.previousNext.add(number, BorderLayout.CENTER);
		this.previousNext.add(next, BorderLayout.SOUTH);
		this.previous.setEnabled(false);
		this.next.setEnabled(false);

		this.searchPanel = new JPanel();
		this.searchField = new JTextField();
		this.searchButton = new JButton("Search");
		this.searchField.setPreferredSize(new Dimension(700, 30));
		this.searchPanel.setLayout(new BorderLayout());
		this.searchPanel.add(searchField, BorderLayout.WEST);
		this.searchPanel.add(searchButton, BorderLayout.EAST);
		this.searchPanel.add(this.previousNext, BorderLayout.SOUTH);

		this.resultsPanel = new JPanel();
		this.resultsPanel.setPreferredSize(new Dimension(200, 800));
		this.model = new DefaultListModel<String>();
		this.resultsJList = new JList<String>();
		this.resultsJList.setModel(model);
		this.resultsPanel.add(resultsJList);
		this.resultsPanel.setVisible(false);

		this.resultsJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		this.resultsJList.setVisibleRowCount(-1);

		this.picturePanel = new JPanel();
		this.icon = new JLabel();
		this.picturePanel.add(icon);
		JScrollPane pane = new JScrollPane(picturePanel);
		pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		add(searchPanel, BorderLayout.NORTH);
		add(resultsPanel, BorderLayout.WEST);
		add(pane, BorderLayout.CENTER);

	}

	public void setResultsJList(JList<String> resultsJList) {
		this.resultsJList = resultsJList;
	}

	public void setResult(Result[] result) {
		this.result = result;
	}

	public JPanel getPreviousNext() {
		return previousNext;
	}

	public JButton getPrevious() {
		return previous;
	}

	public JButton getNext() {
		return next;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == searchButton) {
			resultsPanel.setVisible(true);
			NYPLInternetThread thread = new NYPLInternetThread(this, searchField.getText(), resultsJList, model);
			thread.start();
		}
	}
}
