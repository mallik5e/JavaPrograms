package StringProject;
import java.util.Scanner;
public class prog13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       String str = scan.next();
       char []arr = str.toCharArray();
       int num = scan.nextInt();
    	for(int i=0;i<=arr.length-1;i++) {
    		arr[i]=(char) ((int)arr[i]+num);
    		System.out.print(arr[i]+" ");
    	}
	}

}
