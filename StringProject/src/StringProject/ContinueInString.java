package StringProject;
import java.util.Scanner;
public class prog15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      String str=scan.next();
      char c1=scan.next().charAt(0);
      for(int i=0;i<=str.length()-1;i++) {
    	  if(c1==str.charAt(i)) {
    		  System.out.print("77");
    		  continue;
    	  }
    	  System.out.print(str.charAt(i));
      }
	}

}
