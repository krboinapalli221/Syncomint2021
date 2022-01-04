package Tcs_Practice;

public class Palindrome_Code {

	public static void main(String[] args) {
		String k="454";
		char[] s=new char[k.length()];
		String kr ="";
		s=k.toCharArray();
		for(int i=0;i<s.length;i++) {
			kr+=s[(s.length-1)-i];
		}
		System.out.println(kr);
		
	if(k.equals(kr)) {
		System.out.println("it is a palindrome");
	}
	else {
		System.out.println("it is not  a palindrome");	
	}
	int ks=Integer.parseInt(kr);
	
	}
}
