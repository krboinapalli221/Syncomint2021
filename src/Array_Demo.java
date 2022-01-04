import java.util.Scanner;

public class Array_Demo {

	public static void main(String[] args) {
		try {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int b=s.nextInt();
		int[] a= new int[b];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the value for index"+i);
			a[i]=s.nextInt();
		
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicates"+a[i]);								
				}
				
				
			}
		  }
		}
		catch(Exception e) {
			System.out.println("Enter the correct value");
		}

	}

}
