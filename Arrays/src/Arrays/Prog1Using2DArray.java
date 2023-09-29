package Arrays;
import java.util.Scanner;
public class Prog1Using2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan = new Scanner(System.in);
           int [][]arr = new int[4][4];
           for(int i=0;i<=arr.length-1;i++) {
        	   for(int j=0;j<=arr[i].length-1;j++) {
        		   arr[i][j]=scan.nextInt();
        	   }
           }
           for(int i=0;i<=arr.length-1;i++) {
        	   for(int j=0;j<=arr[i].length-1;j++) {
        		   System.out.print(arr[i][j]+" ");
        	   }
        	   System.out.println();
           }
           for(int i=0;i<=arr.length-1;i++) {
        	   for(int j=0;j<=arr[i].length-1;j++) {
        		   if(i==0||j==0||i==arr.length-1 || j==arr[i].length-1) {
        		   System.out.print(arr[i][j]+" ");
        	   }else {
        		   System.out.print(" ");
        	   }
        	   System.out.println();
           }
      
	}
	}
}


