package linked_list_template;

public class LinkedList {
	
	//Attributes
	private Node rootNode;
	
	//Constructor
	public LinkedList() {
		
		this.rootNode = null;
	}
	
	//Methods
	
	//IMPLEMENT THIS.
	public void addNode(int data){
		
		System.out.println("Adding " + data + " to the list:");
		
	}
	
	
	//IMPLEMENT THIS.
	public void deleteNode(int dataToDelete){
		
		System.out.println("Deleting " + dataToDelete + " from the list.");
		

		//If not actually in the list.
		System.out.println(dataToDelete + " not in list.");
	}

	
	
	public void traverse(){
		
		System.out.println("Traversing the list:");
		
		if(this.rootNode == null)
		{
			System.out.println("List empty.");
			return;
		}
		
		Node current = this.rootNode;
		
		System.out.println(current.getData());
		
		while(current.getNext_node() != null)
		{
			current = current.getNext_node();
			
			System.out.println(current.getData());
			
		}				
	}

}
