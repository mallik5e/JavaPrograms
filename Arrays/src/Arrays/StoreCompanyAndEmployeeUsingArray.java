package Arrays;
import java.util.Scanner;
public class StoreCompanyAndEmployeeUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the number of companies: ");
      int row = scan.nextInt();
      String [][]arr = new String[row][];
      for(int i=0;i<=arr.length-1;i++) {
    	  System.out.println("enter the number of employee:");
    	  int col = scan.nextInt();
    	  arr[i]=new String[col];
      }
      for(int i=0; i<=arr.length-1;i++) {
    	  for(int j=0;j<=arr[i].length-1;j++) {
    		  System.out.println("enter the company"+(i+1)+" employee"+(j+1)+" name :");
    		  arr[i][j]=scan.next();
    	  }
      }
      for(int i=0; i<=arr.length-1;i++) {
    	  for(int j=0;j<=arr[i].length-1;j++) {
    		  System.out.println(" the company"+(i+1)+" employee"+(j+1)+" name :"+arr[i][j]);
      
	}

}
}
}