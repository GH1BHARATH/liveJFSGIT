package basics;

import java.util.ArrayList;

public class WrapperEx {
	public static void main(String[] args) {
		String idString = "12345";
		int idInt = Integer.parseInt(idString);
		int result = idInt + idInt;
		System.out.println(result);
		
		int i = 100;
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(i);
		//from primitive to wrapper (boxing)
		Integer integerVal = i;
		numbersList.add(integerVal);
		Integer inegerVal1 = Integer.valueOf(i);
		
		Integer integer1 = new Integer(100);
		// from wrapper to primitive (unboxing)
		int intValue = integer1;
	}
}
