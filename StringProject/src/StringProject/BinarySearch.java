package StringProject;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array input values");
        for(int i=0;i<=arr.length-1;i++) {
        	arr[i]=scan.nextInt();
        }
        System.out.println("array data are: ");
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("enter searching key");
        int key=scan.nextInt();
        
	   
	    	 
          int  low=0;
          int high = arr.length-1;
          int mid=(low+high)/2;
          for(int i=0;i<=arr.length-1;i++) {
          if(key==arr[mid]) {
        	  System.out.println("key is found");
        	 return;
        	  }
          else if(key>arr[mid]) {
        	  low=mid+1;
        	  high=high;
        	  mid=(low+high)/2;
          }
          else {
        	  high=mid-1;
        	  low=low;
        	  mid=(low+high)/2;
          }
	    	 
	     }    
}
}
