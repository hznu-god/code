package git;
import java.util.Scanner;
public class homework3_eight {
	final static int maxn=10000;
	public static int[] merge(int[] list1,int[] list2) {
//		int len=list1.length+list2.length;
		int[] ans=new int[list1.length+list2.length];
		for(int i=0;i<list1.length;++i) {
			ans[i]=list1[i];
		}
		for(int i=0;i<list2.length;++i) {
			ans[i+list1.length]=list2[i];
		}
		for(int i=0;i<list1.length+list2.length;++i) {//Ñ¡ÔñÅÅÐò
			int pos=i;
			for(int j=i+1;j<list1.length+list2.length;++j) {
				if(ans[j]<ans[pos]) {
					pos=j;
				}
			}
			int temp=ans[i];
			ans[i]=ans[pos];
			ans[pos]=temp;
		}
//		for(int i=0;i<list1.length+list2.length;++i) {//Ã°ÅÝÅÅÐò
//			for(int j=0;j<list1.length+list2.length-1;++j) {
//				if(ans[j+1]<ans[j]) {
//					int temp=ans[j];
//					ans[j]=ans[j+1];
//					ans[j+1]=temp;
//				}
//			}
//		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list1 size and contents: ");
		int size1=input.nextInt();
		int[] list1=new int[size1];
		for(int i=0;i<size1;++i) {
			list1[i]=input.nextInt();
		}
		System.out.print("Enter list2 size and contents: ");
		int size2=input.nextInt();
		int[] list2=new int[size2];
		for(int i=0;i<size2;++i) {
			list2[i]=input.nextInt();
		}		
		System.out.print("list1 is ");
		for(int i=0;i<size1;++i) {
			System.out.print(list1[i]+" ");
		}
		System.out.println();
		System.out.print("list2 is ");
		for(int i=0;i<size2;++i) {
			System.out.print(list2[i]+" ");
		}
		System.out.println();
		System.out.print("The merged list is ");
		int[] ans=new int[maxn];
		ans=merge(list1,list2);
		for(int i=0;i<list1.length+list2.length;++i) {
			System.out.print(ans[i]+" ");
		}
	}

}
