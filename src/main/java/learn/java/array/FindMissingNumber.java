package learn.java.array;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] a = {1,3} ;
		int missingNumber = findMissingNumber(a);
		int missingNumber2 = findMissingNumber2(a);
		System.out.println("Missing number from "+Arrays.toString(a)+" is :"+missingNumber);
		System.out.println("Missing number from "+Arrays.toString(a)+" is :"+missingNumber2);
	}

	private static int findMissingNumber2(int[] a) {
		//1. Find out the length of the array
		int n = a.length ;
		
		//1.1 Actual sixze is n+1 since a number is missing from the array
		int m = n+1 ;
		//2. sum of integer between 1 to n
		int totalSum = m*(m+1)/2 ;
		System.out.println(totalSum);
		//3. Find out the actual sum of array element 
		int sum = 0 ;
		for(int i=0; i<n ; i++) {
			sum += a[i] ;
		}
		System.out.println(sum);
		int missing = totalSum-sum ;
		return missing;
	}

	private static int findMissingNumber(int[] a) {
		int n = a.length ;
		int total = (n+1)*(n+2) / 2 ;
		System.out.println("Sum of array is "+total);
		for(int i=0; i<n; i++) {
			total -= a[i] ;
		}
		return total;
	}

	
}
