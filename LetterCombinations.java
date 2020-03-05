package learn.java.concepts.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

	 public List<String> letterCombinations(String digits) {
		 Map<Integer, String> combinations = new HashMap<Integer, String>() ;
			combinations.put(2, "a,b,c");
			combinations.put(3, "d,e,f");
			combinations.put(4, "g,h,i");
			combinations.put(5, "j,k,l");
			combinations.put(6, "m,n,o");
			combinations.put(7, "p,q,r,s");
			combinations.put(8, "t,u,v");
			combinations.put(9, "w,x,y,z");
					 
			int first =0    ;
			int second  =0  ;
			String[] a ;
			 String[] input1 ;
			 String[] input2 ;
			 ArrayList<String> retVal = new ArrayList<>() ;
			if(digits != null && digits.length() !=0 ) {
			
				if(digits.length() ==1) {
					 a = digits.split("") ;
					 first = Integer.valueOf(a[0]) ;
					 input1 = combinations.get(first).split(",") ;
					for(int i=0; i<input1.length ; i ++) {
						  retVal.add(input1[i]) ;
					 }
					 return retVal ;
				}
				else{
					a = digits.split("") ;
					 first = Integer.valueOf(a[0]) ;
					 second = Integer.valueOf(a[1]) ;
					 input1 = combinations.get(first).split(",") ;
					 input2 = combinations.get(second).split(",") ;
					
					 for(int i=0; i<input1.length ; i ++) {
						 for(int j=0; j<input2.length; j++) {
							 retVal.add(input1[i]+input2[j]) ;
						 }
					 }
					 return retVal ;
					
				}
			}else {
				 return retVal ;
			}
		 
			
		
	 }
	 
	public static void main(String[] args) {
		System.out.println(new LetterCombinations().letterCombinations("23"));
	}
}
