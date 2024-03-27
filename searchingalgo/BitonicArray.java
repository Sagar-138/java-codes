package searchingalgo;

public class BitonicArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
//		findMinElementBitonicArray(arr);
//		findMaxElementBitonicArray(arr);
		int ans=findMaxElementBitonicArray(arr);
		if(ans== -1) {
			System.out.println("not found");
		}else {
			System.out.println("found "+ arr[ans]+" at pos "+ ans);
		}
	}
	
	static int findMaxElementBitonicArray(int arr[]) {
		int start =0;
		int end=arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			int next =(mid +1)%arr.length;
			int prev =(mid -1 +arr.length)%arr.length;
			if(arr[mid]>arr[prev] && arr[mid]>arr[next]) {
					return mid;
			}else if(arr[mid]>arr[prev]) {
				start=mid+1;
			}
			else {
				end=mid -1;
			}
		}
		return -1;
	}

	
	static void findMinElementBitonicArray(int arr[]) {
		if(arr.length == 0) {
			System.out.println("array is empty");
			
		}else if(arr.length == 1) {
			System.out.println("min element is : "+ arr[0]);
		}else {
			int res = (arr[0]<arr[arr.length - 1])?arr[0]:arr[arr.length-1];
			System.out.println("min element is : "+ res);
		}
	}

}
