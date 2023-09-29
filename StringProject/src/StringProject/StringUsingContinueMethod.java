package StringProject;
import java.util.Scanner;
public class prog17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan = new Scanner(System.in);
          String str = scan.nextLine();
          char c = scan.next().charAt(0);
          int UniqueCode=scan.nextInt();
          for(int i=0;i<=str.length()-1;i++) {
        	  if(UniqueCode==(int)str.charAt(i)) {
        		  System.out.print(c);
        		  continue;
        	  }
        	  System.out.print(str.charAt(i));
          }
	}

}
