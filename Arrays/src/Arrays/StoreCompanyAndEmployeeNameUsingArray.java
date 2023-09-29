package Arrays;
import java.util.Scanner;
public class StoreCompanyAndEmployeeNameUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       int m = scan.nextInt();
       int n =scan.nextInt();
       String [][]arr = new String[m][n];
       for(int i=0;i<=arr.length-1;i++) {
    	   for(int j=0;j<=arr[i].length-1;j++) {
    		   System.out.println("enter the name of company"+(i+1) + "employee"+(j+1));
    		   arr[i][j] = scan.next();
    	   }
    	   System.out.println();
       }
    	   for(int i=0;i<=arr.length-1;i++) {
    		   for(int j=0;j<=arr[i].length-1;j++) {
    			   System.out.println("The employees are "+(j+1)+" in company"+(i+1)+" is "+arr[i][j]);
    		   }
    	   }
       }
	}


