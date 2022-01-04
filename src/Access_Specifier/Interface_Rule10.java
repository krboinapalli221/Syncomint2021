package Access_Specifier;
interface Calculator{
	int a=10;
    void add();
}
class MyCalci implements Calculator
{
	  
	public void add() {
		int b = 5;
		a = 12; //Here ,I have modified(int a = 12) the value of a but
	               // it is not showing any error even though its default is final
		int c = a+b;
		System.out.println(c);
		
	}
}
public class Interface_Rule10 {

	public static void main(String[] args) {
		MyCalci m = new MyCalci();
		m.add();
		

	}

}
