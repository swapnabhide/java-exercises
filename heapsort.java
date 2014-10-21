package learning;

import java.util.Arrays;

public class heapsort {
	private static int arr[]={3, 16, 2, 10, 6, 4, 1, 9};
	private static int n;
	
	/*
	 * 
	 * public static void maxheap(int[] a, int i){ 
        left=2*i;
        right=2*i+1;
        System.out.println("in heapify:" +i);
		System.out.println("in heapify:" + Arrays.toString(a));
        if(left <= n && a[left] > a[i]){
            largest=left;
        }
        else{
            largest=i;
        }
        
        if(right <= n && a[right] > a[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            maxheap(a, largest);
        }
    }
	 */
	
	static void heapify(int str){
		int l = 2*str;
		int r = 2*str +1;
		System.out.println("in heapify:" +str);
		System.out.println("in heapify:" + Arrays.toString(arr));
		int largest;
		if((l < n ) && (arr[l] > arr[str]))
			largest = l;
		else
			largest = str;
		if((r < n ) && (arr[r] > arr[largest]))
			largest = r;
		if((largest != str) && (largest!=-1)){
			int temp = arr[str];
			arr[str] = arr[largest];
			arr[largest] = temp;
			heapify(largest);
		}
	}
	
	/*
	 * public static void buildheap(int []a){
    	System.out.println("1 :" +a.length);
        n=a.length-1;
        for(int i=n/2;i>=0;i--){
            maxheap(a,i);
            System.out.println(i);
        }
    }
	 * 
	 */
	static void buildHeap(){
		System.out.println("1 :" +arr.length);
		n = arr.length-1;
		for(int j = n /2 ; j >= 0; j--){
			heapify(j);
			System.out.println(j);
		}
	}
	
	
	/*
	 * 
	 *   public static void sort(int []a0){
        a=a0;
        buildheap(a);
        
        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
        }
    }
	 */
	static void sort(){
		buildHeap();
		for(int i = n; i > 0; i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			n--; 
			heapify(0);
		}
	}
	
	public static void main(String[] args){
		int a[]= arr.clone();
		System.out.println("array befor e sorting" + Arrays.toString(arr));
		sort();
		System.out.println("array after sorting" + Arrays.toString(arr));
		
	}
}
