package git;
import java.util.Scanner;
public class homework3_two {
	public static void main(String[] args) {
		final int maxn=1000;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] number=new int[maxn];
		int[] flag=new int[maxn];
		int i=1;
		for(int j=0;j<10;++j) {
			int step=input.nextInt();
			if(flag[step]==0) {
				flag[step]++;
				number[i++]=step;
			}
			else continue;
		}
		i--;
		System.out.println("The number of distinct numbers is "+i);
		System.out.print("The distinct numbers are: ");
		for(int j=1;j<=i;++j) {
			System.out.print(number[j]+" ");
		}
		System.out.println();
	}

}
