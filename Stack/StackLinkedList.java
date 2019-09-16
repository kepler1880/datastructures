package Stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class StackLinkedList<T> implements Iterable<T>{
	
	//LIFO
	//Stack can be created with array , linked list , double LL
	
	private LinkedList<T> stkList=new LinkedList<T>();
	
	//default constructor
	public StackLinkedList() {
		
	}
	
	//constructor with first element
	public StackLinkedList(T firEle) {
		push(firEle);
	}
	
	//size
	public int stackSize() {
		return stkList.size();
	}
	
	//isempty
	public boolean isEmpty() {
		if (stkList.size() == 0)
			return true;
		return false;
	}
	
	
	//push	
	public void push(T elem) {
		stkList.addLast(elem);
	}
	
	//pop
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException(); 
		}
		return stkList.removeLast();
	}
	
	
	//peek
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException(); 
		}
		return stkList.peekLast();
	}

	
	@Override
	public Iterator<T> iterator() {		
		return stkList.iterator();
	}
	
	
	public static void main(String args[]) {

			StackLinkedList s = new StackLinkedList();		

		    s.push(1);
		    s.push(2);
		    s.push(3);
		    s.push(4);
		    s.push(5);

		    System.out.println(s.pop()); // 5
		    System.out.println(s.pop()); // 4
		    System.out.println(s.pop()); // 3

		    s.push(3);
		    s.push(4);
		    s.push(5);
		    
		  
		    while (!s.isEmpty()) {
		    	System.out.println(s.peek());		    	
		    	s.pop();
		    	//System.out.println(s.pop());
		    }
		    
		    StackLinkedList s1 = new StackLinkedList("first");
		    s1.push("apple");
		    s1.push("orange");
		    s1.push("mango");
		    
		    System.out.println(s1.pop()); 
		    System.out.println(s1.pop());
		    
		    System.out.println("----------");
		    
		    
		    while (!s1.isEmpty()) {
		    	System.out.println(s1.peek());		    	
		    	s1.pop();
		    }
		    
		    

	}
}
