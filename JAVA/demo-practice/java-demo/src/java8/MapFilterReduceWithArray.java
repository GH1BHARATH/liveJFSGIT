package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class MapFilterReduceWithArray {
	public static void main(String[] args) {
//		oldStyleIteration();
//		mapping_operation();
//		filter_operation();
		reduction_operation();
	}

	private static void oldStyleIteration() {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(6);
		integerList.add(10);
		// oldest form of iteration
		for (int i = 0; i < integerList.size(); i++) {
			Integer number = integerList.get(i);
			System.out.println(number);
		}
		// enhanced for loop
		System.out.println("Enhanced for loop");
		for (Integer number1 : integerList) {
			System.out.println(number1);
		}

		// using iterator
		System.out.println("using Iterator");
		Iterator<Integer> iterator = integerList.iterator();
		while (iterator.hasNext()) {
			Integer number3 = iterator.next();
			System.out.println(number3);
		}
		
	}

	private static void mapping_operation() {
		// A simple array
		String[] players = new String[] { "sam", "peter", "billy", "lilly" };
//		Integer[] playerAge = new Integer[] { 1,2,3,4,5 };
		Stream<String> playerStream = Arrays.stream(players);
//		Stream<Integer> playerAgeStream = Arrays.stream(playerAge);
		Stream<String> upperCaseStream = playerStream.map(player -> player.toUpperCase());
//		upperCaseStream.forEach(player -> System.out.println(player));
		upperCaseStream.forEach(System.out::println);		
		// Converting the stream back to an array
//		String[] newPlayer = upperCaseStream.toArray(String[] :: new);
//		for(String player :newPlayer) {
//			System.out.println(player);
//		}
//		for(String player :players) {
//			System.out.println(player);
//		}
		
//		Arrays.stream(players).map(player -> player.toUpperCase()).forEach(System.out::println);
	}
	
	private static void filter_operation() {
		// A simple array
		String[] players = new String[] { "sam", "peter", "billy", "lilly" };
//		Integer[] playerAge = new Integer[] { 1,2,3,4,5 };
		Stream<String> playerStream = Arrays.stream(players);
//		Stream<Integer> playerAgeStream = Arrays.stream(playerAge);
		Stream<String> filteredStream = playerStream.filter(player -> player.length() > 3);
//		upperCaseStream.forEach(player -> System.out.println(player));
		filteredStream.forEach(System.out::println);		
	}
	private static void reduction_operation() {
		// A simple array
		int[] playerSalary = new int[] { 7000, 100, 200 };
		int sum = 0;
		for(int i = 0; i< playerSalary.length; i++) {
			sum = sum + playerSalary[i];
		}
		System.out.println(sum);	
		System.out.println(Arrays.stream(playerSalary).sum());
	}
}
