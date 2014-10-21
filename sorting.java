package learning;

import java.util.Arrays;

public class sorting {
	private static int arr[]={3, 16, 2, 10, 6, 4, 1, 9};
	
	public static int partision(int s, int e){
		int p= e /2;
		System.out.println(p);
		int temp = arr[p];
		arr[p] = arr[e];
		arr[e] = temp;
		System.out.println("1 :" +Arrays.toString(arr));
		int pi = s;
		for (int i = s; i<= e -1; i++){
			if(arr[i]<= arr[e]){
			int temp1 = arr[i];
			arr[i] = arr[pi];
			arr[pi] = temp1;
			pi++;	
			}
			System.out.println("2 :"+ pi  + Arrays.toString(arr));
		}
		int temp2 = arr[e];
		arr[e] = arr[pi];
		arr[pi] = temp2;
		System.out.println("3 :" +Arrays.toString(arr));
		return pi;
		
	}
	public static  void quicksort(int str,int end){
		
		if (str < end){
			int pi = partision(str, end);
			//System.out.println(pi);
			quicksort(str,pi-1);
			quicksort(pi+1,end);
			
		}
	}
	
	
	
	
	public static void main (String args[]){
		int a1[]= arr.clone();
		System.out.println("array before sorting : "+ Arrays.toString(arr) );
		quicksort(0,arr.length-1);
		System.out.println("array after sorting : "+ Arrays.toString(arr) );
	}
}
