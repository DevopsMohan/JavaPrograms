package com.sdetprograms;

public class RevString {

	public static void main(String[] args) {
		
		//Using  + (String  Operator + (Concatenation Operator) 
		
		String  str="ABCD";
	    String rev = null;
		
	    // Counting the number of characters in a string
	    int len=str.length();
 
	    System.out.println(len);
	    
	    for (int i=len-1;i>=0;i--)
	    {
	    	rev=rev+str.charAt(i);
	    }
	    
System.out.println("Reverse of the string:"+ rev);
	}

}
