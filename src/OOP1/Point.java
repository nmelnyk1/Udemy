package OOP1;

public class Point {

	
	private int x;
	private int y;
	
	// Empty constructor
	public Point() {
		
	}
	// Constructor+ parameters

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance () {
		return Math.sqrt(((0 - this.x)*(0 - this.x)) + ((0 - this.y)*(0 - this.y)));
	}
	public double distance( int x, int y) {
		return Math.sqrt(((x - this.x)*(x - this.x))
				+ ((y - this.y)*(y - this.y)));
	}
	public double distance(Point point) {
		return Math.sqrt(((point.x - this.x)*(point.x - this.x))
				+ ((point.y - this.y)*(point.y - this.y)));
		
	}
	
}
// Math.sqrt - returns correctly rounded positive square root of a double value.
// double x = 9; Math.sqrt(9)=3.0
