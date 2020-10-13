package git;
import java.util.Scanner;
public class homework2_six {
	public static void main(String[] args) {
		final int RADIUS=10;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		double distance=Math.sqrt(x*x+y*y);
		if(distance<=RADIUS) {
			System.out.println("Point ("+x+", "+y+") is in the circle");
		}
		else {
			System.out.println("Point ("+x+", "+y+") is not in the circle");
		}
	}

}
