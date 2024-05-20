package recursion;

public class printdec {
	
	public static void printDec(int n) {
		if(n==1) {
			System.out.print(n);
			return;
		}
		System.out.print(n+" ");
		printDec(n-1);
	}
	
	public static void printInc(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		printInc(n-1);
		System.out.print(n+" ");
		
	}
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int f=fact(n-1);
		int factorial= n*fact(n-1);
		return factorial;
	}
	
	public static int sumNatural(int n) {
		if(n==1) {
			
			return 1;
		}
		int sn = sumNatural(n-1);
		int s= n + sumNatural(n-1);
		return s;
		
		
	}
	
	public static int fibo(int n) {
		if(n== 0 || n==1) {
			return n;
		}
		int f1= fibo(n-1);
		int f2 = fibo(n-2);
		return f1+f2;
	}
	
	public static int firstOccur(int arr[], int key, int i) {
		if(arr[i]== key) {
			return i;
		}
		return firstOccur(arr, key, i+1);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printInc(10);
//		System.out.println(fact(5));
//		System.out.println(fibo(3));
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		System.out.println(firstOccur(arr, 0, 0));
	}

}
