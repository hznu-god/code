package git;
import java.util.Scanner;
public class homework3_four {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int step=0;
		double[] number=new double[11];
		for(int i=0;i<10;++i) {
			number[step++]=input.nextDouble();
		}
		for(int i=0;i<10;++i) {
			for(int j=0;j<9;++j) {
				if(number[j]<number[j+1]) {
					double temp=0;
					temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
		System.out.print("The 10 numbers are: ");
		for(int i=0;i<10;++i) {
			System.out.print(number[i]+" ");
		}
	}

}
