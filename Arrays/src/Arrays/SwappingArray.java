package Arrays;
import java.util.Scanner;
public class SwappingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan = new Scanner(System.in);
          int size = scan.nextInt();
          int []arr = new int[size];
          for(int i=0;i<=arr.length-1;i++) {
        	  arr[i]=scan.nextInt();
          }
          int temp=0;
          System.out.println("Before swapping: ");
          for(int i=0;i<=arr.length-1;i++) {
        	  System.out.print(arr[i]+" ");
          }
          System.out.println();
          System.out.println("enter the index value to swapp: ");
          int i1=scan.nextInt();
          int i2=scan.nextInt();
          for(int i=0;i<=arr.length-1;i++) {
        	  if(i1>=0 && i1<=arr.length-1 && i2>=0 && i2<=arr.length-1) {
        	  temp = arr[i1];
        	  arr[i1]=arr[i2];
        	  arr[i2]=temp;
          }
        	  else {
        		  System.out.println("index not found");
        		  return;
        	  }
          
	}
          System.out.println("After swapping:  ");
          for(int i=0;i<=arr.length-1;i++) {
        	  System.out.print(arr[i]+" ");
          }

}
}
