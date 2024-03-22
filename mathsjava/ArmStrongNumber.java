package mathsjava;

public class ArmStrongNumber {
	public static void main(String[] args) {
//		armStrongNumber(152);
//		palindromeNumber(121);
	}

	public static void armStrongNumber(int num) {
		int res = 0;
		int copy = num;
		while (num > 0) {
			int digit = num % 10;// lastdigit
			res = (int) (res + Math.pow(digit, 3));
			num /= 10;

		}
		System.out.println(copy == res);
	}
	
	public static void palindromeNumber(int num) {
			int revNum=0;
			int copy=num;
			while(num>0) {
				int lastDigit= num%10;
				revNum= revNum*10 + lastDigit;
				num/=10;
			}
			System.out.println(copy==revNum);
		}
	

}
