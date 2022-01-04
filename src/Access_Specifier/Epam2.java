package Access_Specifier;

public class Epam2 {
	
public static String a ="";
public static int k=0;
	public static void main(String[] args) {
		String s="java2code";
		char[] s1 = s.toCharArray();
		for(int i=0;i<s1.length;i++)
		{
			if(Character.isDigit(s1[i])) {
				k=s1[i];				
				add(k);	
			}
			else {
				a=a+s1[i];							
			}
			
		}
		System.out.println(a);
	}
	public static void add(int k) {
		for(int i = 1;i<k;i++) {
			a+=a;
			}
		
		
	}
	

}
