package yarmark.gui;

public class GuiDemo {
	public static void main(String[] args) {

		// do not create a JFrame object
		// instead, extend the JFrame class and create an instance
		// you will customize the class in the JFrame class

		//JFrameDemo frame = new JFrameDemo();

		QuadraticGUI frame = new QuadraticGUI();
		frame.setVisible(true);
	}
}
