package Arrays;
import java.util.Scanner;
public class SumOfArray {
	public static int array(int []arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=scan.nextInt();
        }
        System.out.println(array(arr));
        
	}

}
