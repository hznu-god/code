package git;
import java.util.Scanner;
public class homework3_one {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] number=new int[110]; 
		while(input.hasNext()) {
			int step=input.nextInt();
			if(step==0)break;
			number[step]++;
		}
		for(int i=1;i<=100;++i) {
			if(number[i]!=0) {
				if(number[i]>1)
				System.out.println(i+ " occurs "+number[i]+" times");
				else {
					System.out.println(i+ " occurs "+number[i]+" time");
				}
			}
		}
	}

}
