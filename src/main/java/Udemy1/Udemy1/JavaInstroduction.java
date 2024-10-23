package Udemy1.Udemy1;

import java.util.ArrayList;

public class JavaInstroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		System.out.println(a[0]);
		for(int i=0; i<a.length; i++) {	
		System.out.println(a[i]);	
		}
        for(int a1 : a) {		
			System.out.println(a1);
		}
	    for( int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
	    }
	    ArrayList<String> a1 =new ArrayList<String>();
	    a1.add("hey");
	    a1.add("nish");
	    a1.remove(1);
	    for(int i=0; i<a1.size() ; i++) {
	    	System.out.println(a1.get(i));	
	    }
	    //String in java
	    String s = "nish acharya m ";
	    
	    System.out.println(s);
	    String[] s1= s.split("acharya");//splitting string and storing in string array
	    System.out.println(s1[0]);
	    //printing array of 0 element 
	    System.out.println(s1[1]);
	    System.out.println(s1[1].trim());// trimming the left and right side of the array
	    
	    for(int i=0; i<s.length(); i++ ) {
	    	System.out.println(s.charAt(i));//printing each character in the string
	    }
	    //reversing string 
	    for(int i=s.length()-1; i>=0; i--) {
	    	System.out.println(s.charAt(i));
	    }
	   
	}

}
