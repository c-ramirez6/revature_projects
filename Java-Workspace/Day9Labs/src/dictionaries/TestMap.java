package dictionaries;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "A forbidden fruit");
		dictionary.put("banana", "A yellow fruit that can be peeled");
		dictionary.put("cantaloupe", "A melon fruit that has an orange flesh");
		System.out.println(dictionary);
		
		String key = "apple";
		String value = dictionary.get(key);
		System.out.println("The value for the key: " + key + " is " + value);
		
		TreeMap<String, String> tree = new TreeMap<>();
		tree.putAll(dictionary);
		System.out.println(tree);
		tree.put("beet", "An actual vegitable");
		System.out.println(tree);
		tree.put("beet", "Another description");
		System.out.println(tree);
		
		Set<String> keyset = tree.keySet();
		
		for(String x : keyset) {
			System.out.println("key:" + x);
		}
	}
}
