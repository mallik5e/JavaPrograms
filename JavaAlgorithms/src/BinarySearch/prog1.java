package BinarySearch;
import java.util.Scanner;
public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int size=scan.nextInt();
      int []arr = new int[size];
      for(int i=0;i<=arr.length-1;i++) {
    	  arr[i] = scan.nextInt();
      }
      System.out.println("enter the searching key value: ");
      int key = scan.nextInt();
      int low=0;
      int high=arr.length-1;
      int mid=(low+high)/2;
      for(int i=0;i<=arr.length-1;i++) {
    	  while(low<=high) {
    		  if(key==arr[mid]) {
    			 System.out.println("key "+key+" is found at index"+mid);
    			 return;
    		  }
    		  else if(key>arr[mid]) {
    			  low = mid+1;
    			  high=high;
    			  mid=(low+high)/2;
    		  }
    		  else {
    			  high=mid-1;
    			  low=low;
    			  mid=(low+high)/2;
    		  }
    		  System.out.println("key is not found");
    	  }
    	  
      }
     
      
	}

}
