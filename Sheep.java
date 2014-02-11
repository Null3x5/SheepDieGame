package edu.calstatela.cs203.ignaciozuniga.homework1;


import java.awt.Color;
import java.awt.Graphics;

public class Sheep extends Entity {

	public Sheep(int x, int y, Color c) {
		super(x, y, c);
	}

	public String toString() {
		return "sheep" + super.toString();
	}
	
	public void die() {
		alive = false;
		c = Color.red;
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	void paint(Graphics pen) {
		pen.setColor(c);
		pen.fillRect(X_MARGIN + xstep * x + 2, Y_MARGIN + ystep * y + 2, 16, 16);
		pen.setColor(Color.BLACK);
		pen.drawRect(X_MARGIN + xstep * x + 2, Y_MARGIN + ystep * y + 2, 16, 16);
	}
}
