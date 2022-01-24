package java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
//		objectInstanceMethodReference();
		objectInstanceMethodReference1();
		staticMethodReference();
	}

	public static void objectInstanceMethodReference() {
		// :: the method reference operator
		List<String> namesList = new ArrayList<String>();
		namesList.add("Tony");
		namesList.add("Robbins");
		namesList.forEach(item -> System.out.println(item));
		// use a lambda expression to call an instance method of an object
		namesList.forEach(System.out::println);
	}

	public static void objectInstanceMethodReference1() {
		// :: the method reference operator
		Integer[] integerArray = { 5, 6, 7, 8 };
		Utils utils = new Utils();
		Counter counter2 = utils::countElementsInstance;
//		Counter counter2 = new Utils()::countElementsInstance;
		int result1 = counter2.count(integerArray);
		System.out.println(result1);
	}
	
	public static void staticMethodReference() {
		// :: the method reference operator
		Integer[] integerArray = { 5, 6, 7, 8 };
		// DELCLARING THE LAMBDA EXPRESSION
		Counter counter = array -> Utils.countElements(array);
		// INVOKING THE EXPRESSION
		int result = counter.count(integerArray);
//		Counter counter1 = new Counter() {
//			@Override
//			public int count(Object[] objectArray) {
//				return Utils.countElements(objectArray);
//			}
//		};
//		int result = counter1.count(integerArray);
		System.out.println(result);
		
		Counter counter2 = Utils::countElements;
		int result1 = counter2.count(integerArray);
		System.out.println(result1);
	}
	
}


class Utils {
	// STATIC METHOD
	public static int countElements(Object[] array) {
		return array.length;
	}

	// INSTANCE METHOD
	public int countElementsInstance(Object[] array) {
		return array.length;
	}
}

@FunctionalInterface // The type of a lambda expression
interface Counter {
	// functional interfaces contain one abstract method.
	int count(Object[] objectArray);
//	int count (Object[] objectArray) {
//		return Utils.countElements(array)
//	}
//	
}