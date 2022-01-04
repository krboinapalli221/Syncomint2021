package Tcs_Practice;

public class Prime_No_bt {
	 public static void main(String[] args){
	  int count=0;
	  int k=0;
	  int i=2;
	  int m=0;
	  for(;i<100;i++)
	  {
	   for(int j=1;j<=i;j++)
	    {
	      if(i%j==0){
	         count++;
	         }
	     }
	    if(count<=2)
	    {
	    // System.out.println(i);
	       k++;
	     }
	       if(k>=10 && k<=15){       
	  System.out.println(i);
	  break;
	       } 
	     count=0;
	   }
	 
	 
	  
	  }
	}