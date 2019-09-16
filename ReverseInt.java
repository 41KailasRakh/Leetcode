package learn.java.leetcode;

public class ReverseInt {

	public int reverse(int input) {
		
		boolean isNegative = input < 0 ? true : false ;		
		int result = 0 ;
		if(isNegative) {
			input = input * -1 ;
		}
		while(input > 0 && input <=2147483647) {
			result = result*10 + input % 10 ;
			input = input /10 ;
		}
		
		result = isNegative ? result * -1 : result ;		 		
		 		 
		return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int) result;
	}
	public static void main(String[] args) {
		 
		System.out.println(new ReverseInt().reverse(-123));
	}

}
