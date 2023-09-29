package StringProject;
import java.util.Scanner;
public class prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan = new Scanner(System.in);
           System.out.println("enter the value: ");
           String str1 = scan.next();
           char[]str = str1.toCharArray();
          
           char []revstr = new char[str.length];
           int j=str.length-1;
           for(int i=0;i<=str.length-1;i++) {
        	  revstr[j] = str[i];
        	  j--;
        	   
           }
           for(int i=0;i<=revstr.length-1;i++) {
               System.out.print((revstr[i])+" ");
               }
               System.out.println();
           
           String revstr1 = new String(revstr);
           System.out.print(revstr1+" ");
          
           if(str1.equals(revstr1)) {
        	   System.out.print("palindrome");
           }
	}

}
