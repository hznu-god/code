package git;
import java.util.Scanner;
class student{
	String name;
	double mark;
	student(String str,double step){
		name=str;
		mark=step;
	}
}
public class homework3_three {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		student[] arr=new student[100];
		System.out.print("Enter the number of students: ");
		int number=input.nextInt();
//		System.out.println(number);
		System.out.println("Enter name and mark:");
		for(int i=0;i<number;++i) {
			String str=input.next();
			double mark=input.nextDouble();
			arr[i]=new student(str,mark);
		}
		for(int i=0;i<number;++i) {
	//		student temp=arr[i];
			int pos=i;
			for(int j=i+1;j<number;++j) {
				if(arr[j].mark>arr[pos].mark) {
					pos=j;
				}
			}
			String temp=arr[i].name;
			arr[i].name=arr[pos].name;
			arr[pos].name=temp;
			double temp1=arr[i].mark;
			arr[i].mark=arr[pos].mark;
			arr[pos].mark=temp1;
		}
		for(int i=0;i<number;++i) {
			System.out.println(arr[i].name+" "+arr[i].mark);
		}
	}

}
