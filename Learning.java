/**
 * Name: Charles Stremel
 * Date: 08/02/2025
 * Learning has two integers, 
 * which we choose to add or subtract, 
 * then store the output.
 */

public class Learning {
	public static final int VERSION = 1;
	
	private int x;
	private int y;
	private String operation;
	double output;

	public Learning(int x, int y, String operation) {
		this.x = x;
		this.y = y;
		this.operation = operation;
	}

	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getOperation() {
		return operation;
	}

	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
}
