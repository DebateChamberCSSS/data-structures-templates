package dictionary_template;
import java.util.Scanner;


public class Interface {
	
	public static void main (String args[]) {
		
		
		
		//Creates the linked list with a null root node.
		Dictionary dictionary = new Dictionary();
		//Scanner for input.
		Scanner scan = new Scanner(System.in);
		
		
		
		//TASK 1: Use the method calls in this method to check the dictionary works.
		
		testData(dictionary, scan);
		
		
		
		//TASK 2: Once your test data is working, uncomment this method and implement the login screen.
		
		//fullLoginScreen(dictionary, scan);
		
		
		
		//Close the input scanner.
		scan.close();
	}
		
		
	public static void testData(Dictionary dictionary, Scanner scan){
		
		//Add some key-value pairs
		dictionary.addNode("John", 123);
		dictionary.addNode("Joe", 456);
		dictionary.addNode("Mary", 789);
	
		
		//Search for and print out the passwords
		dictionary.search("Mary");
		dictionary.search("Joe");
		dictionary.search("John");
		

		//Delete some data, does it now show they're not in the dictionary?
		dictionary.deleteNode("Joe");
		dictionary.search("Joe");
	}
		
		
		
	public static void fullLoginScreen(Dictionary dictionary, Scanner scan){

		//User interface.
		System.out.println("\nLogin Screen:");
		System.out.println("1. Login.");
		System.out.println("2. Add new user.");
		System.out.println("3. Delete user.");
		System.out.println("4. Quit.");
		System.out.println("Type your selection: ");
		
	}
}