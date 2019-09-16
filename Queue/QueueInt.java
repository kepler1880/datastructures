package Queue;

public class QueueInt {
	private int arr[];
	private int front ;
	private int rear;
	private int queueSize;
		
	//constructor
	public QueueInt() {
		front=-1;
		rear=-1;
		queueSize=3;
		arr = new int[queueSize];		
	}
	
	//size
	public int size(){
		return arr.length;
	}
	
	//isempty
	public boolean isEmpty(){
		if (front <= rear) {
			return true;
		}
		return false;
	}
	
	//enqueqe
	public void enqueue(int data) {
		if((front + 1) >= queueSize) {
			resize();
		}
		arr[++front]=data;
	}
	
	//dequeue
	public Integer dequeue() {
		if(front > rear) {
		return arr[++rear];
		}
		return null;
	}
	
	
	//peek
	
	

	private void resize() {
		int tmp[]= arr;
		queueSize=queueSize*2;
		arr = new int[queueSize];
		for(int i=0; i<=front;i++) {
			arr[i]=tmp[i];
		}
	}

	public static void main(String[] args) {
		QueueInt q = new QueueInt();

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
