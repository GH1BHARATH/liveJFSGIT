package basics;

public class StaticMethodEx {
	public static void main(String[] args) {
		System.out.println(Learner.meetingPlatform);
		Learner.getPlatform();
		
		Learner yasar = new Learner();
		yasar.name = "Yasar";
		Learner pavithra = new Learner();
		pavithra.name = "Pavithra";
		
		yasar.getName();
		pavithra.getName();
	}
}

class Learner {
	// static and belongs to class
	public static String meetingPlatform = "WEBEX";
	public static void getPlatform() {
		System.out.println(meetingPlatform);
	}
	
	// instance and a copy made for each instance
	public String name;
	public void getName() {
		System.out.println(name);
	}
}