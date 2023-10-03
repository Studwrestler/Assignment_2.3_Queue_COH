/**
 * This is the application class that implements the queue class and uses it a little bit
 * @author Chase
 * CS215 10-05-2023
 */

public class Application {
	/**
	 * Default
	 */
	Application(){
		
	}
    /**
     * The main method for running the Queue application.
     *
     * @param args The command-line arguments (not used in this application).
     */
	public static void main(String[] args) {
		Queue<String> queue = new Queue<>();

		queue.enqueue("Bill");
		queue.enqueue("Alice");
		queue.enqueue("Bob");

		queue.printQueue();
		System.out.println();

		String servedCustomer1 = queue.dequeue();
		System.out.println();
		if (servedCustomer1 != null) {
			System.out.println("A customer is served: " + servedCustomer1);
		}
		System.out.println();

		queue.printQueue();

		System.out.println();
		System.out.println();
		System.out.println("More customers arrive.");
		System.out.println();
		queue.enqueue("Jane");
		queue.enqueue("Hamad");

		queue.printQueue();

		System.out.println();

		String servedCustomer2 = queue.dequeue();
		String servedCustomer3 = queue.dequeue();

		System.out.println();

		if (servedCustomer2 != null && servedCustomer3 != null) {
			System.out.println("Two customers are served: " + servedCustomer2 + " and " + servedCustomer3);
		}
		System.out.println();
		
		queue.printQueue();

		queue.enqueue("Jim");
		System.out.println();
		System.out.println();

		System.out.print("Another customer arrives");
		System.out.println();
		System.out.println();
		queue.printQueue();
		
		System.out.println();
		System.out.println();
		String servedCustomer4 = queue.dequeue();
		String servedCustomer5 = queue.dequeue();

		if (servedCustomer4 != null && servedCustomer5 != null) {
			System.out.println("Two more customers are served: " + servedCustomer4 + " and " + servedCustomer5);
		}

		System.out.println();
		queue.printQueue();
	}//end main
}//end class
