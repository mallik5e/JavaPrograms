package StringProject;
import java.util.Scanner;
public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String []arr = str.split(" ");
            System.out.println("Total number of words: "+arr.length);
            
            for(int i=0;i<=arr.length-1;i++) {
            	System.out.println("word-"+(i+1)+":"+arr[i]);
            
            }
           
	}

}
