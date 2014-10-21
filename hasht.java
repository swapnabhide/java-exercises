package learning;

import java.util.Hashtable;

public class hasht {
	static  String str = "SQL Injection is an attack on the database via the addition of malicious code, mostly in the form of SQL queries, passed into a string that reaches past the application on to the database and causes it to execute against the database. In most cases the hacker is able to obtain unauthorized information off of the database. " +
"This article is intended to discuss some of the ways that MySQL databases can be exposed via SQL Injection techniques.";
	public static int xz = 128;
	
	public static void main (String args[]){
		double d = Math.abs(-100.9);
		float f = Math.abs(-10.90f);
		/*Hashtable<String, Integer> numbers
	    = new Hashtable<String, Integer>();
		numbers.put("a", 1);
		numbers.put("b", 10);
		numbers.put("c", 11);
		
		Integer n = (Integer)numbers.get("a");
		   if (n != null) {
		     System.out.println("a =" + n);*/
		
		/*System.out.println("\u0070");
		xz = 123;
		System.out.println(d + " " + f);
		System.out.println(Math.floor(d));
		System.out.println(Math.ceil(d));
		System.out.println(Math.round(d));*/
		
		/*System.out.println("String is " + str);
		char ch[] = str.toCharArray();
		System.out.println(ch);
		int len = str.length()-1;
		for(int i=0;i<=len;i++){
			
				System.out.println(ch[i]);
				char temp = ch[i];
				ch[i] = ch[len];
				ch[len]= temp;
				len--;
			
		}
		System.out.println(ch);*/
		
		if( str.contains("Swapna")) 
			System.out.println("Wohoooo"); 
		else
			System.out.println("Wohoooo 2");
		
		String str2 = "SQL";
		
		int lastindex = 0;
		int count  = 0;
		
		
		while(lastindex!=-1){
			lastindex = str.lastIndexOf(str2, lastindex);
			
			if( lastindex != -1){
	             count ++;
	             lastindex+=str.length();
	      }
		}
		System.out.println("count is " + count);
	}
		
}
