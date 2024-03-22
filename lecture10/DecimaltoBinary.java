package lecture10;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		decimalToBinary(5,2);
//		binaryToDecimal(101);
//		reverseNum(523);
		power(10,2);
		}
	static void decimalToBinary(int decimalNum, int base) {
		int resNum=0;
		
		int power=0;
		while(decimalNum>0) {
			int rem = decimalNum%base;
			decimalNum /=2;
			resNum+= rem * Math.pow(10,power);
			power++;
			
		}
		System.out.println("Final result: "+resNum);
	}
	
	static void binaryToDecimal(int decimalNum) {

		int resNum=0;
		
		int power=0;
		while(decimalNum>0) {
			int unitDigit=decimalNum%10;
			decimalNum /=10;
			resNum+= unitDigit * Math.pow(2,power);
			power++;
			
		}
		System.out.println("Final result: "+resNum);
	}
	
	static void reverseNum(int num) {
		
		int revNum=0;
		while(num>0) {
			int lastDigit= num%10;
			revNum= revNum*10 + lastDigit;
			num/=10;
		}
		System.out.println(revNum);
	}

	static double power(int num, int power) {
		double res=1;
		for(int i=0;i<power;i++) {
			res=res*num;
			
		}
		System.out.println(res);
		return res;
	}
}
