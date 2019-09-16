package learn.java.leetcode;

import java.util.Arrays;

public class Palindrome {

	public static boolean isPalindrome(int input) {
	 
		if(input < 0)
		return false  ; 
		 String[] cBefore = Integer.toString(input).split("") ;
			
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
		String[] cAfter = Integer.toString(result).split("") ;	
		
		if(Arrays.equals(cAfter, cBefore))
			return true ;
		return false ; 
		 
	}
	
	public static void main(String[] args) {
		
	//	 System.out.println(isPalindrome(10));
		System.out.println(1%10);
		
	}

}
