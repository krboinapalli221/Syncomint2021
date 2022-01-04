

public class Static_Eg {
	
	 static int  a=10;
	static int b=11;//static variables execute first

static 
{
	a=12;
	b=13;// static block executes after static variables
}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		

	}

}
