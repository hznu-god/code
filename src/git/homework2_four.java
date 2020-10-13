package git;
import java.util.Scanner;
public class homework2_four {

	public static void main(String[] args) {
		System.out.print("Enter three sides: ");
		Scanner input=new Scanner(System.in);
		int side1=input.nextInt();
		int side2=input.nextInt();
		int side3=input.nextInt();
		if(side1+side2>side3||side1+side3>side2||side2+side3>side1) {
			System.out.println("The Perimeter is: "+(side1+side2+side3));
		}
		else {
			System.out.println("Illegal input");
		}
	}

}
