package BubbleSort;
import java.util.Scanner;
public class BubbleSort {
      public static int[] createArray() {
    	  Scanner scan = new Scanner(System.in);
    	  int []arr = new int[scan.nextInt()];
    	  for(int i=0;i<=arr.length-1;i++) {
    		  arr[i] = scan.nextInt();
    		  
    	  }
    	  return arr;
      }
      int[] bubbleSort(int []arr) {
    	  int temp;
    	  for(int i=0;i<=arr.length-1;i++) {
    		  for(int j=0; j<=arr.length-1-i; j++) {
    			  if(arr[j+1]<arr[j]) {
    				  temp=arr[j];
    				  arr[j] = arr[j+1];
    				  arr[j+1]=temp;
    			  }
    		  }
    	  }
    	  return arr;
      }
      void displayArray(int []sortedArray) {
    	  System.out.print("arrays: ");
          for(int i=0;i<=sortedArray.length-1;i++) {
        	  System.out.print(sortedArray[i]+" ");
          }
          System.out.println();
      }
}
