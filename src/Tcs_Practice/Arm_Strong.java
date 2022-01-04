package Tcs_Practice;
public class Arm_Strong {


	public static void main(String[] args) {
		
     int a=153;
     int b1=a;
     int c;
     int result=0;
     while(b1!=0) {
    	c=b1%10;
    	result+=(c*c*c);
    	b1=b1/c;
    	
     }
     System.out.println(result);
     if(a==result) {
    	 System.out.println("Its an armstrong number");
     }
     else {
    	 System.out.println("not an armstrong");
     }
		     

	}

}
