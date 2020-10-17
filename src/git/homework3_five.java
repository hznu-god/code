package git;
import java.util.Scanner;
public class homework3_five {
	public static boolean isSorted(int[] list) {
		for(int i=1;i<list.length;++i) {
			if(list[i]<list[i-1])return false;
		}
		return true;
	}	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int size=input.nextInt();
		System.out.print("Enter the contents of the list: ");
		int[] arr=new int[size];
		for(int i=0;i<size;++i) {
			arr[i]=input.nextInt();
		}
		System.out.print("The list has "+size+" integers ");
		for(int i=0;i<size;++i) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		boolean flag=isSorted(arr);
		if(flag) {
			System.out.println("The list is sorted");
		}
		else {
			System.out.println("The list is not sorted");
		}
	}

}
