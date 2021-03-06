package edu.towson.cis.cosc442.project2.rectangle;

/**
 * The Point Class.
 */
public class Point {
	
	/** x and y coordinates. */
	public Double x, y;
	
	public Point(){
		x = 0.0;
		y = 0.0;
	}
	
	/**
	 * Instantiates a new point.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Point(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
}
