package searchingalgo;

public class FindMiniAbsDiff {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10,12,14};
		findMinAbsDiff(arr,0);

	}
	
	static void findMinAbsDiff(int arr[], int target) {
		if(arr.length== 0) {
			return;
		}
		int start = 0;
		int end = arr.length -1;
		int ans= -1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == target) {
				ans= arr[mid];
				break;
			} else if(arr[mid]<target) {
				start = mid+1;
				
			}
			else {
				end = mid -1;
			}
		}
		int res = 0;
		if(ans == -1) {
			if(end == -1) {
				res= Math.abs(target - arr[start]);
			}else if(start == arr.length) {
				res= Math.abs(target - arr[end]);
			}else {
				int ans1=Math.abs(target - arr[start]);
				int ans2=Math.abs(target - arr[end]);
				res = (ans1<ans2)?ans1:ans2;
			}
		}
		System.out.println(res);
		
	}

}
