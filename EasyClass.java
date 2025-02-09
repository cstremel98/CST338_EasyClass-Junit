/**
 * Name: Charles Stremel
 * Date: 08/02/2025
 * EasyClass has a score, count, and name,
 * as well as getters and setters for each.
 */

public class EasyClass {
	private double score;
	private int count;
	private String name;

	public EasyClass(double score, int count, String name) {
		this.score = score;
		this.count = count;
		this.name = name;
	}

	public double getScore() {
		return score;
	}
	public int getCount() {
		return count;
	}
	public String getName() {
		return name;
	}

	public void setScore(double score) {
		this.score = score;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setName(String name) {
		this.name = name;
	}
}
