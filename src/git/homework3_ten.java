package git;
import java.util.Scanner;
public class homework3_ten {
	public static String sort(String s) {
		char[] arr=new char[s.length()];
		for(int i=0;i<s.length();++i) {
			arr[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();++i) {
			int pos=i;
			for(int j=i+1;j<s.length();++j) {
				if(arr[j]<arr[pos]) {
					pos=j;
				}
			}
			char ch=arr[i];
			arr[i]=arr[pos];
			arr[pos]=ch;
		}
		String ans=new String(arr);
		return ans;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=input.nextLine();
		String ans=sort(s);
		System.out.println("String after sorting is "+ans);
	}

}
