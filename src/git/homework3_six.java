package git;
import java.util.Scanner;
public class homework3_six {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean[] arr=new boolean[110];
		for(int i=1;i<=100;++i) {
			arr[i]=true;
		}
		for(int i=2;i<=100;++i) {
			for(int j=i;j<=100;j+=i) {
				arr[j]=!arr[j];
			}
		}
		for(int i=1;i<=100;++i) {
			if(arr[i])
				System.out.print(i+" ");
		}
	}

}
