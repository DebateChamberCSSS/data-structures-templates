package linked_list_template;

public class Interface {
	
	public static void main (String args[]) {
		
		//Creates the linked list with a null root node.
		LinkedList list = new LinkedList();
		
		
		//Show the list starts empty.
		list.traverse();

		
		//TASK 1: Implement the addNode() method in the LinkedList class.
		//Add some data and show that it prints.
		list.addNode(2);
		list.traverse();

		
		//Add some more data, does it still print?
		list.addNode(4);
		list.addNode(7);
		list.traverse();
		

		/* EXTENSION! Implement the addNode() method in the LinkedList class.Delete comments to try.
		 * 
		//Delete some data, does it print correctly?
		list.deleteNode(4);
		list.traverse();		
		*
		*/
		
	}
}