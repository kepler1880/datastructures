
public class LinearSearch {
	public static void main(String args[]) {
		int arr[] = { 3, 8, 10, 34, 2 };
		int v = 6;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == v) {
				System.out.println("Value present " + arr[i]);
				return;
			}
		}
		System.out.println("Value not present");
		return;
	}

}
