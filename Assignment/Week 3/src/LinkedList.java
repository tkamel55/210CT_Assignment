// q4 using linked list method to test the cases. 

class ListNode {
  private Object data;
  private ListNode next;
  ListNode(Object o) { data = o; next = null; }
  ListNode(Object o, ListNode nextNode) 
    { data = o; next = nextNode; }
  Object getData() { return data; }
  ListNode getNext() { return next; }
  void setData(Object data){
    this.data = data;
  }
  void setNext(ListNode next){
    this.next = next;
  }
} // class ListNode
 
class EmptyListException extends RuntimeException {
  public EmptyListException () { super ("List is empty"); }
} // class EmptyListException
 
class LinkedList {
  private ListNode head;
  private ListNode tail;
  public LinkedList() { head = tail = null; }
  public boolean isEmpty() { return head == null; }
  public void addToHead(Object item) {
    // TO BE COMPLETED
    if(isEmpty())
      head = tail = new ListNode(item);
    else
      head = new ListNode(item,head);
  }
  public void addToTail(Object item) {
    // TO BE COMPLETED
    if(isEmpty())
      head = tail = new ListNode(item);
    else {
      tail.setNext(new ListNode(item));
      tail = tail.getNext();
    }
  }
  
  public Object removeFromHead() throws EmptyListException {
    // TO BE COMPLETED
    Object item = null;
    if(isEmpty())
      throw new EmptyListException();
    item = head.getData();
    if(head == tail)
      head = tail = null;
    else
      head = head.getNext();
    return item;
  }
  public Object removeFromTail() throws EmptyListException {
    // TO BE COMPLETED
    Object item = null;
    if(isEmpty())
      throw new EmptyListException();
    item = tail.getData();
    if(head == tail)
      head = tail = null;
    else{
      ListNode current = head;
      while(current.getNext() != tail)
        current = current.getNext();
      tail = current;
      current.setNext(null);
    }
    return item;
  }
  public String toString () {
    String s = "[ ";
    ListNode current = head;
    while (current != null) {
      s += current.getData() + " ";
      current = current.getNext();
    }
    return s + "]";
  }
} 