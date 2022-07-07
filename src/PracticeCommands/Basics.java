package PracticeCommands;

public class Basics {

	public static void main(String[] args) {
		
		String name = "Nikesh";
		String colour = "Blue";
		
		String greeting = ("My name is " + name + ", I like the colour " + colour);
		System.out.println(greeting);
		
		
		String fullname = "Nikesh Bhudia";
		
		String surname = fullname.substring(6);
		
		System.out.println(surname);
		
	}
}