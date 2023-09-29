package StringProject;
import java.util.Scanner;
public class wordCount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
       String []arr = str.split(" ");
       for(int i=0;i<=arr.length-1;i++) {
    	 
    	   System.out.println("characters in "+arr[i]+" is : "+arr[i].length());
       }
	}

}
