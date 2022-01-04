package Access_Specifier;

public class Exception1 {
 static int a=10;
 static int b = 0;
 static int c;
     
	public static void main(String[] args) {
		try {
		c=a/b;
		System.out.println(c);

	
     }
     catch(Exception e) {
    	 System.out.println("Exception occured");
     }
	}
}
