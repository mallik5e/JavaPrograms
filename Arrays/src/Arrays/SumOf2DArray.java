package Arrays;
import java.util.Scanner;
public class SumOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scan = new Scanner(System.in);
            int row=scan.nextInt();
            int col=scan.nextInt();
            int [][]a= new int[row][col];
            int [][]arr = new int[row][col];
            int [][]arr1 = new int[row][col];
            for(int i=0;i<=arr.length-1;i++) {
            	for(int j=0;j<=arr[i].length-1;j++) {
            		arr[i][j]=scan.nextInt();
            	}
            	}
            for(int i=0;i<=arr1.length-1;i++) {
            	for(int j=0;j<=arr1[i].length-1;j++) {
            		arr1[i][j]=scan.nextInt();
            	}
            	}
            for(int i=0;i<=arr.length-1;i++) {
            	for(int j=0;j<=arr[i].length-1;j++) {
            		a[i][j]=arr[i][j]+arr1[i][j];
            		System.out.print(a[i][j]+" ");
            	}
            	System.out.println();
            	}
            
	for(int i=0;i<=arr.length-1;i++) {
    	for(int j=0;j<=arr[i].length-1;j++) {
    		a[i][j]=arr[i][j]-arr1[i][j];
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
    	}
    
            	
	}
}

