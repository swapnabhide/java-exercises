package learning;

import java.util.Arrays;

public class heap 
{
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    
    public static void buildheap(int []a){
    	System.out.println("1 :" +a.length);
        n=a.length-1;
        for(int i=n/2;i>=0;i--){
            maxheap(a,i);
            System.out.println(i);
        }
    }
    
    public static void maxheap(int[] a, int i){ 
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
    
    public static void exchange(int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t; 
        }
    
    public static void sort(int []a0){
        a=a0;
        buildheap(a);
        
        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
        }
    }
    
    public static void main(String[] args) {
        int []a1={3, 16, 2, 10, 6, 4, 1, 9};
        System.out.println("array befor e sorting" + Arrays.toString(a1));
        sort(a1);
        System.out.println("array befor e sorting" + Arrays.toString(a1));
        }
    }
