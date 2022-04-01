import java.util.Scanner;

public class ReverseArray {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []a=new int[5];
		   System.out.println("Enter 5 array ele");
		   takeArray(a);
		   printarray(a);
		   System.out.println("reverse is ");
		   reverse(a);
		   

		}
		private static void reverse(int[] a) {
		// TODO Auto-generated method stub
			int[] newArr=new int[5];
			int j=0;
			for(int i=a.length-1;i>=0;i--) {
				newArr[i]=a[j];
				j++;
			}
			for(int i=0;i<newArr.length;i++) {
				System.out.println(newArr[i]);
			}
		
	}
		private static void takeArray(int[] a) {
			// TODO Auto-generated method stub
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
		}
		
		private static void printarray(int[] a) {
			// TODO Auto-generated method stub
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
		}
	
}



