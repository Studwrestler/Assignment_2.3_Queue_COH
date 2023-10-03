/**
 * This Queue class that implements a generic linked list and turns it into a
 * queue
 * 
 * @author Chase
 * 
 * @param <T> Generic used to make a generic queue of any type
 */
public class Queue<T> {
	private GenericLinkedList<T> linkedList;// Will store all the data of the queue
	private GenericNode<T> headNode; // so you have access to the lead node

	/**
	 * The main constructor for the queue
	 */

	public Queue() {
		linkedList = new GenericLinkedList<>();
		headNode = null;
	}// end constructor

	/**
	 * Adds something to the queue
	 * 
	 * @param item defines what is added to the queue
	 */
	public void enqueue(T item) {
		GenericNode<T> node = new GenericNode<T>();
		node.setData(item);
		if (headNode == null) {
			headNode = node;
		}
		linkedList.addNode(node);
	}// end enqueue

	/**
	 *removes first thing from the queue 
	 * @return what item is removed
	 */

	public T dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return null;
		}

		T data = headNode.getData();
		headNode = headNode.getNextNode(); 

		if (headNode == null) {
			// If the queue becomes empty, reset the linkedList
			linkedList = new GenericLinkedList<>();
		}

		return data;
	}//end dequeue
	
	/**
	 * Determines if there is anything in the queue
	 * @return
	 */

	public boolean isEmpty() {
		return headNode == null;
	}//end isEmpty
	
	/**
	 * prints what is in the queue
	 */
	public void printQueue() {
		GenericNode<T> currentNode = headNode;
		System.out.println("Queue:");
		while (currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNextNode();
		}

	}//end printQueue
}//end class

