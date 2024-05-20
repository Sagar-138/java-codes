package hashing;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("India",1000);
		hm.put("china", 100);
		System.out.println(hm);
		
		System.out.println(hm.get("India"));
		
		System.out.println();
		
		System.out.println(hm.remove("china"));
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey("India"));
		

	}

}
