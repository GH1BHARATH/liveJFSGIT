package basics;
//Import the java.util package which contains the scanner
import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
// Accept input from the user using Scanner class
// Read from the standard input (keyboard) System.in
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter message :");
		String message = scannerObject.nextLine();
		System.out.println("Your message is : " + message);
	}
}
