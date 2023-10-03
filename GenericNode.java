
/**
 * This class models a Node object which contains Strings. Each node has its
 * internal data (a String) and pointers to the next node in the list.
 * 
 * @author Chase Hall Programming Project 3 Start Project CS131ON
 * @param <T>Used so we can use any type of data
 */
public class GenericNode<T> {
	private T data; // data that the object stores
	private GenericNode<T> nextNode; // pointer to the nextNode that will be in LinkedList

	/**
	 * Constructor build Node object. Initializes nextNode and data to null.
	 */
	public GenericNode() {
		setNextNode(null);
		data = null;
	}// end empty-argument constructor

	/**
	 * This method sets the data of the object.
	 * 
	 * @param data used to set the data
	 */
	public void setData(T data) {
		this.data = data;
	}// end setData

	/**
	 * This method returns the data of the object.
	 * 
	 * @return the data of type t being used
	 */
	public T getData() {
		return this.data;
	}// end getData

	/**
	 * This method returns itself to the caller.
	 * 
	 * @return this
	 */
	public GenericNode<T> getNode() {
		return this;
	}// end getNode

	/**
	 * This method updates the pointer for the next node.
	 * 
	 * @param nextNode used to set the next node
	 */
	public void setNextNode(GenericNode<T> nextNode) {
		this.nextNode = nextNode;
	}// end setNextNode

	/**
	 * This method returns the node stored in the next node pointer.
	 * 
	 * @return Node object the next node
	 */
	public GenericNode<T> getNextNode() {
		return this.nextNode;
	}// end getNextNode

}// end class