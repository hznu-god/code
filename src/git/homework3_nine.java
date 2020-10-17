package git;
import java.util.Scanner;
public class homework3_nine {
	public static int  partition(int[] list) {
		int pivot=0;
		int low=1;
		int high=list.length-1;
		int flag=0;
		while(low<high) {
			if(list[low]>list[pivot]) {
				while(list[high]>=list[pivot]) {
					high--;
				}
				int temp=list[low];
				list[low]=list[high];
				list[high]=temp;
				low++;
			}
			else {
				low++;
			}
		}
		if(high<=low) {
			while(list[high]>=list[pivot]) {
				high--;
			}
			int temp=list[high];
			list[high]=list[pivot];
			list[pivot]=temp;
		}
		return high;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list size: ");
		int size=input.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter list content: ");
		for(int i=0;i<size;++i) {
			arr[i]=input.nextInt();
		}
//		System.out.print("the enter list is ");
//		for(int i=0;i<size;++i) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		System.out.print("After the partition, the list is ");
		int ans=partition(arr);
		for(int i=0;i<size;++i) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		System.out.println(ans);
	}

}
