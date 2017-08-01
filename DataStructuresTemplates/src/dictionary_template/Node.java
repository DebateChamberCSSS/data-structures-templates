package dictionary_template;

public class Node {
	
	//Attributes
	private int data;
	private Node next_node = null;
	
	//Constructor
	public Node (String key, int data) {
		
		this.setData(data);
		
	}

	//Methods
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext_node() {
		return next_node;
	}

	public void setNext_node(Node next_node) {
		this.next_node = next_node;
	}

}
