import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String args[]) {
		int[] lst = {4,9,7,1,3,6,5};
		// Arrays.sort(lst);
		// print out [1,3,4,5,6,7,9]
		// System.out.println(Arrays.toString(lst));
		
		//my logic
		for(int i=0;i<lst.length;i++ ) {
			for(int j=i+1;j<lst.length;j++) {
				if(lst[j] < lst[i]) {
					int tmp=lst[i];
					lst[i]=lst[j];
					lst[j]=tmp;				
				}
			}
		}
		System.out.println(Arrays.toString(lst));			

		
		//one
		//selectionSortOne(lst);

		// actual internal implementation of sort		
		//selectionSort(lst);
		
		
		//new way		
		int[] arr1 = {9,14,3,2,43,11,58,22};  
        selectionSortEx(arr1);//sorting array using selection sort  
       
    }  
	
	
	static void selectionSortOne(int[] lst) {
	    // get the length
	    int n = lst.length;
	    for (int i = 0; i < n; i++) {
	        int index = 0;
	        int smallest = lst[i];
	        for (int j = i+1; j < n; j++) {
	            if (lst[j] < smallest) {
	                smallest = lst[j];
	                index = j;
	            }
	        int temp = lst[i];
	        lst[i] = smallest;
	        lst[index] = temp;
	    }
	   } 
	    System.out.println(Arrays.toString(lst));
	}

	
	static void selectionSort(int[] lst) {
	    // get the length
	    int n = lst.length;
	    for (int i = 0; i < n-1; i++) {
	        int min_idx = i;
	        for (int j = i+1; j < n; j++) {
	            if (lst[j] < lst[min_idx]) {
	                min_idx = j;
	            }
	         
	        int temp = lst[min_idx];
	        lst[min_idx] = lst[i];
	        lst[i] = temp;
	    }
	   } 
	    System.out.println(Arrays.toString(lst));
	}
	
	
	 public static void selectionSortEx(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        } 
	        
	        System.out.println("Inside :: "+Arrays.toString(arr));
	    }  
}
