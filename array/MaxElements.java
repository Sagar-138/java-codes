package array;

public class MaxElements {

	public static void main(String[] args) {
		int arr[] = {2,4,13,6,12,9,2};
		maxElements(arr);

	}
	public static void maxElements(int arr[]) {
		int max= Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("max elemnets is : "+ max);
	}

}
