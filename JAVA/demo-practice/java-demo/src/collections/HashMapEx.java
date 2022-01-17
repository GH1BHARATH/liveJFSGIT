package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {
	public static void main(String[] args) {
//		gettingStarted();
//		merge();
		useStringKeyAndIntegerValue();
	}

	private static void gettingStarted() {
		Map dictionaryMap = new HashMap<>();
		dictionaryMap.put("gargantuan", "something very big");
		dictionaryMap.put("aeonian", "lasting for a indefinite period of time");
		dictionaryMap.put("philatelist", "a person who studies about stamps");
		dictionaryMap.put("abcdef", null);
//		dictionaryMap.put(null, "no-worries");
		System.out.println(dictionaryMap);
		System.out.println("Size : " + dictionaryMap.size());
// ternary operator
		String searchResult = dictionaryMap.containsKey("gargantuans") ? "Found Key" : "Key Not Found";
		System.out.println(searchResult);
		searchResult = dictionaryMap.containsValue("something very big") ? "Found Value" : "Value Not Found";
		System.out.println(searchResult);
		if (dictionaryMap.isEmpty()) {
			System.out.println("Empty");
		} else {
			System.out.println("Collection Not Empty");
		}

		dictionaryMap.clear();
		System.out.println(dictionaryMap);
		if (dictionaryMap.isEmpty()) {
			System.out.println("Empty");
		} else {
			System.out.println("Collection Not Empty");
		}
		System.out.println("Size : " + dictionaryMap.size());
	}

	private static void merge() {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
//		treeMap.put("DeepWork", 1);
//		treeMap.put("DeepWork", 3);
		treeMap.merge("DeepWork", 1, (oldValue, newValue) -> oldValue + newValue);
		System.out.println(treeMap);
		treeMap.merge("DeepWork", 2, (oldValue, newValue) -> oldValue + newValue);
		System.out.println(treeMap);

		TreeMap<String, Integer> treeMap1 = new TreeMap<String, Integer>();
//		treeMap.put("DeepWork", 1);
//		treeMap.put("DeepWork", 3);
		treeMap1.put("Account", 1000);
		System.out.println(treeMap1);
		treeMap1.merge("Account", 100, (oldValue, newValue) -> oldValue - newValue);
		System.out.println(treeMap1);
		treeMap1.merge("Account", 200, (oldValue, newValue) -> oldValue - newValue);
		System.out.println(treeMap1);
	}

	private static void useStringKeyAndIntegerValue() {
		Map<String, Integer> performanceMap = new HashMap<String, Integer>();
		performanceMap.put("Yasar", 80);
		performanceMap.put("Rama", 79);

		int performance = performanceMap.get("Yasar");
		System.out.println(performance);
		System.out.println(performanceMap);

	}

}
