package searchingalgo;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {3,4,5,6,7,8,9,10};
//		binarySearch(arr, 4);
		int arrdes[]= {87,54,36,22,18,1};
//		binarySearchDesc(arrdes, 22);
		binarySearchagnosticSearch(arrdes, 36);
		binarySearchagnosticSearch(arr, 8);
		
		
	}
	static void binarySearchagnosticSearch(int arr[], int target) {
		int start = 0;
		int end = arr.length-1;
		if(start<=end) {
			binarySearch(arr, target);
		}else {
			binarySearchDesc(arr,  target);
		}
	}
	static void binarySearchDesc(int arr[], int target) {
		int ans = -1;
		int start=0;
		int end = arr.length -1;
		while(start<=end) {
			int mid= start + (end-start)/2;
			if(arr[mid] == target) {
				ans = mid;
				break;
			} else if(arr[mid]<target) {
				end=mid -1;
			} else {
				start = mid +1;
			}
		}
		if (ans == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Found element "+ target+ " at index : "+ ans);
        }
		
	}
	
	 static void binarySearch(int arr[], int target){
	        int ans = -1;
	        int start = 0;
	        int end = arr.length-1;
	        while (start<=end){
	            int mid = start + (end-start)/2;
	            if(arr[mid] == target){
	                ans = mid;
	                break;
	            } else if(arr[mid]<target){
	                start = mid+1;
	            } else {
	                end = mid-1;
	            }
	        }
	        if (ans == -1){
	            System.out.println("Element not found");
	        }
	        else {
	            System.out.println("Found element "+ target+ " at index : "+ ans);
	        }


	    }
}
