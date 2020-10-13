package git;
import java.util.Scanner;
public class homework2_three {

	public static void main(String[] args) {
		int number=(int)(100+Math.random()*1000);
		System.out.print("Enter three numbers: ");
		Scanner keyboard=new Scanner(System.in);
		int kb=keyboard.nextInt();
		if(kb==number) {
			System.out.println("Win $10000");
		}
		else {
			int []n=new int[3];
			int []k=new int[3];
			 n[0]=number/100;
			 n[1]=(number%100)/10;
			 n[2]=(number%10);
			 k[0]=kb/100;
			 k[1]=(kb%100)/10;
			 k[2]=(kb%10);
			 int step=0;
			for(int i=0;i<3;++i) {
				for(int j=0;j<3;++j) {
					if(n[i]==k[j]) {
						step++;
					}
				}
			}
			if(step==3)System.out.println("Win $3000");
			else if(step==1)System.out.println("Win $1000");
			else System.out.println("No money!");
		}
	}

}
