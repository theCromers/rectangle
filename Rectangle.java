package lab3;

public class Rectangle {
	private int x, y, width, height, area;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.area= width*height;
	}

	public void setFields(int inX, int inY, int inWidth, int inHeight) {
		this.x = inX;
		this.y = inY;
		this.width = inWidth;
		this.height = inHeight;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	public int getArea() {
		return this.area;
	}
	public boolean isSquare() {
		if (width==height) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return "Rectangle located at (" + x + "," + y + ") with dimensions " + width + "x" + height + " and area "+area+".";
	}
}
