package Arrays;
import java.util.Scanner;
public class ProgramOn3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
         int m  = scan.nextInt();
         int n = scan.nextInt();
         int p = scan.nextInt();
         float [][][]arr = new float[m][n][p];
         for(int i=0;i<=arr.length-1;i++) {
        	 for(int j=0;j<=arr[i].length-1;j++) {
        		 for(int k=0;k<=arr[i][j].length-1;k++) {
        			 System.out.println("enter the cities"+(i+1)+" company"+(j+1)+"employee"+(k+1)+"salries: ");
        			 arr[i][j][k] = scan.nextFloat();
        		 }
        	 }
         }
         for(int i=0;i<=arr.length-1;i++) {
        	 for(int j=0;j<=arr[i].length-1;j++) {
        		 for(int k=0;k<=arr[i][j].length-1;k++) {
        			 System.out.println("The cities"+(i+1)+" company"+(j+1)+"employee"+(k+1)+"salries: "+arr[i][j][k]);
        			 
        		 }
        	 }
         }
        
	}

}
