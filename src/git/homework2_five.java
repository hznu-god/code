package git;
import java.util.Scanner;
public class homework2_five {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year: ");
		int year=input.nextInt();
		System.out.print("Enter month: ");
		int month=input.nextInt();
		System.out.print("Enter the day of the month: 1-31 :");
		int day=input.nextInt();
		int h=0;
		if(month==1||month==2) {
			int j=(year-1)/100;
			int k=(year-1)%100;
			h=(day+(26*(month+13))/10+k+k/4+j/4+5*j)%7;
		}
		else {
			int j=year/100;
			int k=year%100;
			h=(day+(26*(month+1))/10+k+k/4+j/4+5*j)%7;
		}
		System.out.print("Day of the week is ");
		switch(h) {
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 0:
			System.out.println("Saturday");
			break;
		case 1:
			System.out.println("Sunday");
			break;
		}
	}

}
