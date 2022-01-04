package Access_Specifier;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try{
		System.out.println("connection is established");		
		System.out.println("Enter the size of Array");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(a[i]);
		}
		}
		catch(InputMismatchException ip) {
			System.out.println("Exception occured");
		}
		catch(NegativeArraySizeException ne) {
			System.out.println("Please enter positive size only");			
		}
		System.out.println("connection is terminated");
		
	}

}
