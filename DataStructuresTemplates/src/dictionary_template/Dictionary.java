package dictionary_template;

public class Dictionary {
	
	//Attributes
	private Node rootNode;
	
	//Constructor
	public Dictionary() {
		
		this.rootNode = null;
	}
	
	//Methods
	
	//Implement this.
	public void addNode(String key, int value){
		
		System.out.println("Adding user " + key + ", with password " + value + ", to the system.");
		
	}
	
	
	//Implement this.
	public void deleteNode(String keyToDelete){
		
		System.out.println("Deleting " + keyToDelete + " from dictionary.");
		
	
		
		//If it's not in there anyway.
		System.out.println(keyToDelete + " not in dictionary.");
	}


	//Implement this.
	public int search(String key){
		
		System.out.println("Searching for " + key + "'s password");
		
		
		//If it's not found.
		System.out.println("User doesn't exist.");
		return 0;
	}

}
