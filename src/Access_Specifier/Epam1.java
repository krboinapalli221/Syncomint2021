package Access_Specifier;
abstract class Calculator2{
	final int a=10;
	abstract void add();
}
class MyCalci2 implements Calculator
{
	
	public void add() {
		int b = 5;
	    int a = 12;//Here ,I have modified the value of a but
	               // it is not showing any error even though its default is final
		int c = a+b;
		System.out.println(c);
		
	}
}


public class Epam1 {

	public static void main(String[] args) {
		
			MyCalci m = new MyCalci();
			m.add();
			
		

	}

}
