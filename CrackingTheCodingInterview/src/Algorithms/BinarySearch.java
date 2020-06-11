package Algorithms;

public class BinarySearch {
	static int recursiveSearch(int arr[], int l, int r, int x) {
		if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return recursiveSearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return recursiveSearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1;
	}
	
	static int iterativeSearch(int[] arr, int x) {
		int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
	}
	
	public static void main(String args[]) {
		int[] arr = {1,3,4,13,17,22,24,28,29,31,33};
		
		System.out.print("Recursive Search: ");
		System.out.println(recursiveSearch(arr, 0, arr.length-1, 31));
		
		System.out.print("Iterative Search: ");
		System.out.println(iterativeSearch(arr, 31));
		
	}
}
