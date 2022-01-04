package Access_Specifier;
class Demo01
{
	public static int a=1;
	protected int b=2;
	         int c=3;
	private int d=4;
	
	
}
class Demo02 extends Demo01 
{
	
	void public_value()
	{
	System.out.println("jdns");
}
}


public class Protected_01 {

	public static void main(String[] args) {
		Demo02 d = new Demo02();
		d.public_value();
		
		System.out.println(Demo01.a);
		

	}

}
