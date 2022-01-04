import java.util.Scanner;
interface Calculator

{
	void add();
	void sub();
    
	
}
class Mycalculator1 implements Calculator
 
{
	public void add() {
	
	int a =10;
	int b =12;
	int c = a+b;
	System.out.println(c);
	}
	public void sub() {
		int a = 20;
		int b = 15;
		int c = a-b;
		System.out.println(c);
	}

		
}
class Mycalculator2 implements Calculator

{
	Scanner scan = new Scanner(System.in);
	
	public void add() {
		System.out.println("Enter the number: ");
		int a =scan.nextInt();
		System.out.println("Enter the second number:");
		int b = scan.nextInt();
	    int c = a+b;
	System.out.println(c);
	}
	public void sub() {
		System.out.println("Enter the number: ");
		int a =scan.nextInt();
		System.out.println("Enter the second number:");
		int b = scan.nextInt();
		int c = a-b;
		System.out.println(c);
	}
}

class Mycalculator3 implements Calculator

{
	Scanner scan = new Scanner(System.in);
	
	public void add() {
		System.out.println("Enter the number: ");
		int a =scan.nextInt();
		System.out.println("Enter the second number:");
		int b = scan.nextInt();
		if(b==0) {
			System.out.println("Zero value is entered");
		}
		else {
	    int c = a+b;
	    System.out.println(c);
		}

	}
	public void sub() {
		System.out.println("Enter the number: ");
		int a =scan.nextInt();
		System.out.println("Enter the second number:");
		int b = scan.nextInt();
		if(b==0) {
			System.out.println("Entered value is zero");
		}
		else {		
		int c = a-b;
		System.out.println(c);
		}
		
	}
}
class Math
{
	void permit(Calculator ref) {
		ref.add();
		ref.sub();
		
	}
}
public class Interfaces_01 {

	public static void main(String[] args) {
		Mycalculator1 mc1 = new Mycalculator1();
		Mycalculator2 mc2 = new Mycalculator2();
		Mycalculator3 mc3 = new Mycalculator3();
		Math m = new Math();
		m.permit(mc1);
		m.permit(mc2);
		m.permit(mc3);
	}

}
