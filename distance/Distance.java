package distance;

import java.util.Scanner;

public class Distance {
	// instance members
	private int feet;
	private float inches;

	public Distance(int feet, float inches) {
		super();
		this.feet = feet;
		this.inches = inches;
	}

	// constructor
	public Distance() {
		super();
	}

	// getter and setter methods
	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public float getInches() {
		return inches;
	}

	public void setInches(float inches) {
		this.inches = inches;
	}

	//distance function to add two distances
	public void distance(Distance d1, Distance d2) {
		feet = d1.feet + d2.feet;
		inches = d1.inches + d2.inches;
		display();
	}

	public void display() {
		System.out.println(feet + "feet" + " " + inches + "inches");
	}

}
