//PACKAGE SHOULD BE THE FIRST STATEMENT
package basics;
//SOURCE CODE

// CREATE A CLASS CALLED WELCOME
class Welcome {
	// ENTRY POINT FOR THE PROGRAM
	//CREATE THE MAIN METHOD
	public static void main(String args[]){
		System.out.println("Welcome to our first java program");
        int number = 500;
        int number1 = 5;
     System.out.println(number + " * " + number1 + " = " + number*number1);
     System.out.printf("%d * %d = %d", number, number1, number * number1);
	}
}