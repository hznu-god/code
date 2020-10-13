package git;
import java.util.Scanner;
public class homework2_ISBN {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		String s=input.nextLine();
		int ans=0;
		for(int i=0;i<s.length();++i) {
			int tem=s.charAt(i)-'0';
			ans+=tem*(i+1);
		}
		if((ans%11)==10) {
			s+='X';
			System.out.println(s);
		}
		else {
			System.out.print("The ISBN-10 number is "+s);
			System.out.print(ans%11);
		}
	}

}
