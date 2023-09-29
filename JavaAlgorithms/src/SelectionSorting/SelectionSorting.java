package SelectionSorting;
import java.util.Scanner;
public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
         int size = scan.nextInt();
         int []arr = new int[size];
         for(int i=0;i<=arr.length-1;i++) {
        	 arr[i]=scan.nextInt();
         }
         System.out.println("Before sorting: ");
         for(int i=0;i<=arr.length-1;i++) {
        	 System.out.print(arr[i]+" ");
         }
         for(int i=0;i<=arr.length-2;i++) {
        	 int max=arr[i];
        	 int pos=i;
        	 for(int j=i+1;j<=arr.length-1;j++) {
        		 if(arr[j]>max) {
        			 max=arr[j];
        			 pos=j;
        		 }
        		 int temp = arr[i];
        		 arr[i] = arr[pos];
        		 arr[pos]= temp;
        	 }
         }
         System.out.println("After sorting: ");
         for(int i=0;i<=arr.length-1;i++) {
        	 System.out.print(arr[i]+" ");
         }
	}

}
