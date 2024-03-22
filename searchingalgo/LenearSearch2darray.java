package searchingalgo;

public class LenearSearch2darray {

	public static void main(String[] args) {
		int arr2d[][]= {
				{2,4,1,5,1},
				{6,7,3,4,2},
				{0,1,2,2,3},
				{5,5,5,8,4}
		};
		
		linearSearch2d(arr2d, 8, false);

	}
	public static void linearSearch2d(int arr2d[][], int target, boolean findlast) {
		int outerIndex=-1;
		int innerIndex=-1;
		for(int i=0; i<arr2d.length;i++ ) {
			boolean found =false;
			for(int j=0; j<arr2d[i].length;j++) {
				if(target == arr2d[i][j]) {
					outerIndex=i;
					innerIndex=j;
					if(findlast== false) {
						found = true;
						break;
					}
				}
			}
			if(found == true) {
				break;
			}
		}
		if(outerIndex == -1) {
			System.out.println("element not present");
		}else {
			System.out.println("element pos : "+ outerIndex +" , " + innerIndex);
		}
	}

}
