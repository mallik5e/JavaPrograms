package StringProject;
import java.util.Scanner;
public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      String str1 = scan.next();
      String str2 = scan.next();
      if(str1.length()==str2.length()) {/*str1.equals(str2)*/
    	  System.out.println(str1+str2);
      }
	}

}
