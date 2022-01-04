
public class Whitespace_exam {

	public static void main(String[] args) {
		char c[]= {'a','1','b',' ','A','0'};
		for(int i =0;i<5;i++)
		{
			if(Character.isDigit(c[i])) {
				System.out.println(c[i]+"is a Digit");
			}
			if(Character.isWhitespace(c[i])) {
				System.out.println(c[i]+"is a Whitespace");
			}
			if(Character.isUpperCase(c[i])) {
				System.out.println(c[i]+"is a Uppercase");
			}
			if(Character.isLowerCase(c[i])) {
				System.out.println(c[i]+"is a LowerCase");
			}
			i = i+3;
		}

	}

}
