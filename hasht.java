package learning;

import java.util.Hashtable;

public class hasht {
	public static void main (String args[]){
		
		Hashtable<String, Integer> numbers
	    = new Hashtable<String, Integer>();
		numbers.put("a", 1);
		numbers.put("b", 10);
		numbers.put("c", 11);
		
		Integer n = (Integer)numbers.get("a");
		   if (n != null) {
		     System.out.println("a =" + n);
		   }
	}
		
}
