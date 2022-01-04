package Access_Specifier;
import java.util.*;

public class Epam3 {
	public static void main(String[] args) {

	String str = "abg0njk0";
	char[] arr = str.toCharArray();

	HashSet set = new HashSet();

	for (char i : arr ) {
	set.add(i);
	}

	if((set.size()) == (arr.length))
	System.out.println("unique character");
	else
	System.out.println("repetition");
	}
	}




