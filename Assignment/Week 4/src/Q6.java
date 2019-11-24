// Q6 about stacks using push, pop, peek and search method. 
public class Q6 extends LinkedList {

	public Q6() { 
		super();
	}

	public boolean empty() {
		if (isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public Object push(Object item) {
		addToHead(item);
		return item;
	}

	public Object pop() {
		Object item = removeFromHead();
		return item;
	}

	public Object peek() {
		Object item = get(0);
		return item;
	}

	public int search(Object item) {
		ListNode current = head;
		int num = -1;
		for (int i = 0; i < length; i++) {
			if (item.equals(current.getData())) {
				return i;
			} else {
				current = current.getNext();
			}
		}
		return num;
	}
	
	public static void main (String args[]) {

		Q6 s = new Q6();  
		

		System.out.println(s);

		System.out.println("Patrick is at " + s.search("Patrick"));

		s.push(new Character('A'));
		System.out.println(s);
		s.push(new Character('B'));
		System.out.println(s);
		s.push("Cat");
		System.out.println(s);
		s.push("Dog");
		System.out.println(s);
		s.push(new Integer(123));
		System.out.println(s);
		s.push("Patrick");
		System.out.println(s);
		s.push(new Character('E'));
		System.out.println(s);
		s.push(new Double(789.123));
		System.out.println(s);

		System.out.println("peek() returns: " + s.peek());

		System.out.println("Patrick is at " + s.search("Patrick"));
		System.out.println("A is at " + s.search(new Character('A')));
		System.out.println("789.123 is at " + s.search(new Double(789.123)));
		System.out.println("Peter is at " + s.search("Peter"));


		System.out.println();
	}


}