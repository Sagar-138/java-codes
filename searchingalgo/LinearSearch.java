package searchingalgo;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,3,4,1,7,2,9};
//		linearSearch(arr,44);
//		System.out.println();
//		linearSearchlast(arr,3, false);
//		linearSearchlast(arr,11, true);
		linearSearchMultiple(arr, 2);
	}
	
public static void linearSearchMultiple(int arr[], int target) {
		
		
		int k =0;
		int ansarr[]=new int[arr.length];
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==target) {
			ansarr[k]=i;
			k++;
				
		
			}
		}
		if(k == 0) {
			System.out.println("not found element");
		}else {
			for(int i=0; i<k;i++) {
			System.out.println("found element at index: "+ansarr[i]);
		}
		}
		
		
	}
	
	
	public static void linearSearch(int arr[], int target) {
		
		int ans= -1;
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==target) {
				ans=i;
				break;
			}
		}
		if(ans == -1) {
			System.out.println("not found element");
		}else {
			System.out.println("found element at index: "+ans);
		}
		
		
	}
	
public static void linearSearchlast(int arr[], int target, boolean findlast) {
		
		int ans= -1;
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==target) {
				ans=i;
				if(findlast == false) {
					break;
				}
			
			}
		}
		if(ans == -1) {
			System.out.println("not found element");
		}else {
			System.out.println("found element at index: "+ans);
		}
		
		
	}

}
