package Queue;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueList<T> implements Iterable{
	
	
	private LinkedList<T> list = new LinkedList<T>();

	  public QueueList() {}

	  public QueueList(T firstElem) {
	    enqueue(firstElem);
	  }

	  // Return the size of the queue
	  public int size() {
	    return list.size();
	  }

	  // Returns whether or not the queue is empty
	  public boolean isEmpty() {
	    return size() == 0;
	  }

	  // Peek the element at the front of the queue
	  // The method throws an error is the queue is empty
	  public T peek() {
	    if (isEmpty()) throw new RuntimeException("Queue Empty");
	    return list.peekFirst();
	  }

	  // Poll an element from the front of the queue
	  // The method throws an error is the queue is empty
	  public T dequeue() {
	    if (isEmpty()) throw new RuntimeException("Queue Empty");
	    return list.removeFirst();
	  }

	  // Add an element to the back of the queue
	  public void enqueue(T elem) {
	    list.addLast(elem);
	  }

	  // Return an iterator to alow the user to traverse
	  // through the elements found inside the queue
	  @Override
	  public Iterator<T> iterator() {
	    return list.iterator();
	  }
	
	
	

	public static void main(String[] args) {
		QueueList q = new QueueList();

	    q.enqueue(1);
	    q.enqueue(2);
	    q.enqueue(3);
	    q.enqueue(4);
	    q.enqueue(5);

	    System.out.println(q.dequeue()); // 1
	    System.out.println(q.dequeue()); // 2
	    System.out.println(q.dequeue()); // 3
	    System.out.println(q.dequeue()); // 4

	    System.out.println(q.isEmpty()); // false

	    q.enqueue(1);
	    q.enqueue(2);
	    q.enqueue(3);

	    System.out.println(q.dequeue()); // 5
	    System.out.println(q.dequeue()); // 1
	    System.out.println(q.dequeue()); // 2
	    System.out.println(q.dequeue()); // 3

	    System.out.println(q.isEmpty()); // true
	}

}
