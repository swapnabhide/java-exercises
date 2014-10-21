package learning;

import java.io.IOException;
import java.util.Arrays;

public class fib {

	public static void main(String args[]){
		int array[] = new int[20];
		
		array[0]=0;
		array[1]= 1;
		
		for(int n =2; n <20;n++ )
			array[n]= array[n-1] + array[n-2];
		System.out.println(Arrays.toString(array));
		
			int x= 17;
			int val = fibo(x);
 System.out.println(val);
		
	}
	
	static int fibo(int n){
		if(n==0)
				return 0;
		if(n==1)
			return 1;
		int f = fibo(n-1) + fibo(n-2);
		return f;
	}
	
}
