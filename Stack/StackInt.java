package Stack;

public class StackInt {
	
	private int[] arr;
	private int top;
	private int stackSize;
	
	public StackInt() {
		stackSize= 1;
		top=-1;
		arr=new int[stackSize];
	}
	
	public void push(int item) {
		if(top >= stackSize -1) {
			resize();
		}
		arr[++top]=item;		
	}
	
	private void resize() {
		int[] temp = arr;
		stackSize = stackSize * 2;
		arr = new int[stackSize];

		for (int i = 0; i <= top; i++) {
			arr[i] = temp[i];
		}
	}

	public Integer pop(){
		if (top < 0)
			return null;
		return arr[top--];
	}

	public static void main(String[] args) {
		StackInt s= new StackInt();
		s.push(10);
		s.push(15);
		s.push(20);
		System.out.println(s.pop());
		s.push(25);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}

}
