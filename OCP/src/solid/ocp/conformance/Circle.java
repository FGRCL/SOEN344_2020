package solid.ocp.conformance;

import java.awt.Graphics;

public class Circle implements Drawable{

	private int centerX;
	private int centerY;
	private int radius;
	
	public Circle(int centerX, int centerY, int radius) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public int getRadius() {
		return radius;
	}
	
	public void draw(Graphics g) {
		g.drawArc(centerX-radius, centerY-radius, radius*2, radius*2, 0, 360);
	}
}
