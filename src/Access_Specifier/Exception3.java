package Access_Specifier;

import java.util.InputMismatchException;
import java.util.Scanner;

class Demo1{
	void arrayout() {
		Scanner s = new Scanner(System.in);
		System.out.println("connection is established");		
		System.out.println("Enter the size of Array");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements");
		try {
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(a[i]);
		}
		}
		catch(InputMismatchException ip) {
			System.out.println("Enter a valid Input");
		}
		
		
	}
}

public class Exception3 {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		try {
			d1.arrayout();
		}
		catch(Exception e) {
			try {
				d1.arrayout();
			}
			catch(Exception f) {
				try {
					d1.arrayout();
				}
				catch(Exception g) {
					System.out.println("You'll no longer be able to enter a value");
				}
			}
		}

	}

}
