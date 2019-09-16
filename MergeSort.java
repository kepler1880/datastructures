import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 4, 9, 7, 6, 5, 3, 1 };
		
		int[] finalArr=split(arr);
		System.out.println("finalArr  "+Arrays.toString(finalArr));		
	}

	private static int[] split(int[] arr) {
		int len = arr.length;
		int leftArr[];
		int rightArr[];

		// create the arrays
		// if arr length is even
		if (len % 2 == 0) {
			leftArr = new int[len / 2];
			rightArr = new int[len / 2];
		} else {
			leftArr = new int[len / 2];
			rightArr = new int[len / 2 + 1];
		}
		
		
		// add elements in array
		for (int i = 0; i < len; i++) {
			if (i < len / 2) {
				leftArr[i] = arr[i];
				
			} else {
				rightArr[i-len/2] = arr[i];				
			}
		}		
		//System.out.println(Arrays.toString(leftArr));
		//System.out.println(Arrays.toString(rightArr));
		
		if(leftArr.length > 2)
			leftArr=split(leftArr);
		if(rightArr.length > 2)
			rightArr=split(rightArr);
		
		
		//merge
		return merge(leftArr,rightArr);
			
	}

	private static int[] merge(int[] leftArr, int[] rightArr) {
		int finalArr[] = new int[leftArr.length+rightArr.length];	
	    for(int j=0;j<rightArr.length;j++) {
	    	for(int i=0; i< leftArr.length;i++) {
	    		if (leftArr[i] > rightArr[j]) {
	    			int tmp=finalArr[leftArr.length+1];
	    			finalArr[i]=rightArr[j];
	    			finalArr[leftArr.length+1]=tmp;
	 	        	/*int tmp= rightArr[j];
	 	        	leftArr[i] = rightArr[j];
	 	        	rightArr[j]=tmp;*/
	 	        }	
	    	}
	    }	
	    finalArr=combine(leftArr,rightArr);
		System.out.println("finalArr before  " +Arrays.toString(finalArr));
		return finalArr;
	}
	
	public static int[] combine(int[] a, int[] b){
        int length = a.length + b.length;
        int[] result = new int[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
  

}
