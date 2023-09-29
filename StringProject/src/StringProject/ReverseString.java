package StringProject;
import java.util.Scanner;
public class prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
         String str = scan.nextLine();
          char []revstr = str.toCharArray();
          
          for(int i=revstr.length-1;i>=0;i--) {
        	  char rev=revstr[i];
        	  System.out.print(rev+" ");
          }
          
          
	}

}
/* String str = scan.nextLine();
 * char []str1 = str.toCharArray();
 * char str2 = new char(str.length);
 * int j=str.length-1;
 * for(int i=0;i<=str1.length-1;i++){
 * str2[j] = str1;
 * j--;
 * }
 * String revstr = new String(str2);
 * System.out.print(revstr+" ");
 * 
 *  */
