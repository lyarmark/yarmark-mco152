package yarmark.connect4;

import java.awt.Color;

public class Player {

	private Color color;
	private int number;

	public Player(Color color, int number) {
		this.color = color;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public Color getColor() {
		return this.color;
	}
}
