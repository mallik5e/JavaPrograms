package BubbleSort;
import java.util.Scanner;
public class BubbleSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BubbleSort br = new BubbleSort();
      int []arr = br.createArray();
      System.out.print("arrays: ");
      for(int i=0;i<=arr.length-1;i++) {
    	  System.out.print(arr[i]+" ");
      }
      System.out.println();
        
      int []sortedArray = br.bubbleSort(arr);
      System.out.print("sortedArrays: ");
      for(int i=0;i<=sortedArray.length-1;i++) {
    	  System.out.print(sortedArray[i]+" ");
      }
      System.out.println();
         br.displayArray(sortedArray);
      }
         
}
