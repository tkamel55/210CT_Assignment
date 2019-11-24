// q7 is about queue 
public class Q7 extends LinkedList {

	public Q7() {
		super();
	}

	public void enqueue(Object item) {
		if (head == null) {
			head = new ListNode(item);
			tail = head;
		} else {
			tail.setNext(new ListNode(item));
			tail = tail.getNext();
		}
	}

	public Object dequeue() {
		Object item;

		if (head == null)
			return null;
		item = head.getData();
		head = head.getNext();
		if (head == null)
			tail = null;
		return item;
	}

	public boolean empty() {
		return (head == null);
	}
	
	// to test the program 
	public static void main(String[] args) {
		Q7 q = new Q7();
		
		    
		        q.enqueue(10); 
		        q.enqueue(20); 
		        q.dequeue(); 
		        q.dequeue(); 
		        q.enqueue(30); 
		        q.enqueue(40); 
		        q.enqueue(50); 
		  
		        System.out.println("Dequeued item is " + q.dequeue()); 
		    
	
    }

}