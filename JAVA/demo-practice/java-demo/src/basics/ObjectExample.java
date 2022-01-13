package basics;

public class ObjectExample {
	public static void main(String[] args) {
		// Reference created
		Trainee satya = null;
		// Instance created
		satya = new Trainee();
		satya.name = "Satyanarayana";
		satya.age = 21;
//		satya.display();

		// Object created
		Trainee bharat = new Trainee();
		bharat.name = "Bharat";
		bharat.age = 20;
		
		satya.display();
		bharat.display();
	}
}

class Trainee {
	String name;
	int age;
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
}