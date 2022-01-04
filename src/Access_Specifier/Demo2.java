package Access_Specifier;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		Map<Integer,String> m= new HashMap<Integer,String>();
		m.put(21,"X");
		m.put(53,"y");
		m.put(9,"z");
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		
	}

}
