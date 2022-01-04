package Tcs_Practice;

public class Prime_Numbers {

	public static void main(String[] args) {
		int a=100;
		int count = 0;
		int k=0;
	
		for(int i=2;i<=a;i++) {
			for(int j=1;j<=i;j++) {		
			
			if(i%j==0) {
				count++;				
			}
			
			
		}
			if(count<=2) {
				System.out.println(i);
				k++;
			}
			
			count =0;
	  }
		System.out.println("No. of Prime numbers "+k);
	}

}
