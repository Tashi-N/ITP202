public class LinkedList{
	Node head;
	Node tail;
	int size;
   //constructor
	public LinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
    //it gvies the size of the linked list
	public int size(){
		return size;
	}
    // it check wherethere its true or false like if its empty or not
	public boolean isEmpty(){
		if (size == 0) {
			return true;
		}
		return false;
	}
	// this points the first element of the linked list
	public int first(){
		return head.getElement();
	}
	// it shows the last element of the linked list
	public int last(){
		return tail.getElement();
	}

	// adds new element to first or head
	public void addFirst(int n){
		Node newest = new Node(n, null);

		if (size == 0) {
			 head = newest;
			 tail = newest;
		}

		else{
			newest.setNext(head);
			head = newest;
		}
		size = size + 1;
	}

	// adds element to last or tail 
	public void addLast(int n){
		Node newest = new Node(n, null);
		if (size == 0) {
			head = newest;
			tail = newest;
		}
		else{
			tail.setNext(newest);
			tail =newest;
		}
		size += 1;
	}

	// it removes the first element and written its value
	public int removeFirst(){
		int deletedElement = head.getElement();
		if (size == 0) {
			return 0;
		}
		else{
			head = head.getNext();
			size = size -1;
		}
		return deletedElement;
	}



}
 
class Node{
	private int element;
	private Node next;
	// constructor
	public Node(int element, Node next ){
	    this.element = element;
		this.next = next;
	}

	// getElement 
	public int getElement(){
		return element;
	}

	// getNext()
	public Node getNext(){
		return next;
	}

	// setElement
	public void setElement(int n){
		element = n;
	}

	// setNext
	public void setNext(Node n){
		next = n;
	}
}