package StringProject;
import java.util.Scanner;
public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scan = new Scanner(System.in);
            String str1 = scan.next();
            String str2 = scan.next();
            if(str1.length()==str2.length()) {
            	System.out.println("Both strings are of same length");
            }
            else {
            	System.out.println("Both strings are of different length");
            }
	}

}
