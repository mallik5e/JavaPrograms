package Arrays;
import java.util.Scanner;
public class ProgOn3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
         System.out.println("enter the cities: ");
         int block = scan.nextInt();
         int [][][]arr = new int [block][][];
         for(int i=0;i<arr.length;i++) {
        	 System.out.println("enter the company"+(i+1));
        	 int row =scan.nextInt();
        	 arr[i]= new int[row][];
         }
         for(int i=0;i<arr.length;i++) {
        	 for(int j=0;j<arr[i].length;j++) {
        		 System.out.println("enter the employess"+(j+1));
        		 int col = scan.nextInt();
        		 arr[i][j]=new int[col];
        	 }
         }
         for(int i=0;i<arr.length;i++) {
        	 for(int j=0;j<arr[i].length;j++) {
        		 System.out.println("the companies"+(i+1)+"the employess"+(j+1)+"salaries: ");
        		 arr[block][i][j]=scan.nextInt();
        	 }
         }
         for(int i=0;i<arr.length;i++) {
        	 for(int j=0;j<arr[i].length;j++) {
        		 System.out.println("the companies"+(i+1)+"the employess"+(j+1)+"salaries: "+arr[block][i][j]);
        		 
        	 }
         }
	
	}

}
