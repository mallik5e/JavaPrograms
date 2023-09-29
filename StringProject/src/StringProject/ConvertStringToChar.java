package StringProject;
import java.util.Scanner;
public class prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for(int i=0;i<=str.length()-1;i++) {
        System.out.println( (int)str.charAt(i) );
	}
	}
}
