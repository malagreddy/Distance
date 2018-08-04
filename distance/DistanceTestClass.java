package distance;

//program to add two distances
import java.util.Scanner;

public class DistanceTestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the feet and inches");
		int feet = sc.nextInt();
		int inches = sc.nextInt();
		int feet1 = sc.nextInt();
		int inches1 = sc.nextInt();
		Distance distance = new Distance(feet, inches);
		Distance distance1 = new Distance(feet1, inches1);
		// call display function
		distance.display();
		distance1.display();
		// create an object of Distance class
		Distance obj = new Distance();
		obj.distance(distance, distance1);
	}

}
