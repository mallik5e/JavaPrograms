package Arrays;
import java.util.Scanner;
public class SearchElementUsingArray {
	 public static int Array(int []arr,  int element) {
		   
		   for(int i=0;i<arr.length;i++) {
			   if(element == arr[i]) {
				   return i;
			   }
			   
		   }
		   return -1; 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan = new Scanner(System.in);
           int a = scan.nextInt();
           int []arr = new int[a];
           for(int i=0;i<arr.length;i++) {
        	   arr[i]=scan.nextInt();
           }
           System.out.println("enter the searching element: ");
           int element = scan.nextInt();
           System.out.println(Array(arr, element));
	}
	
  
   

}
