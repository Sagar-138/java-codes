package sortingAlgos;

public class BubbleSort {
	static void bubblesort(int arr[]) {
		for(int turn = 0; turn<arr.length-1; turn++) {
			for(int j=0; j< arr.length-1-turn; j++){
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	
	static void insertionSort(int arr[]) {
		for(int i=1;i<=arr.length-1;i++) {
			int curr=arr[i];
			int prev = i-1;
			while(prev>=0 && arr[prev]>curr) {
				arr[prev +1 ] = arr[prev];
				prev--;
			}
			arr[prev +1]=curr;
		}
	}
	
   static void printarr(int arr[]) {
	   for(int i = 0; i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
	   System.out.println();
   }
	public static void main(String[] args) {
		int arr[]= {3,2,7,1,5,6};
		insertionSort(arr);
		printarr(arr);

	}

}
