package StringProject;
import java.util.Scanner;
public class prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
       /*char []ch = str.toCharArray();
       char []dup = new char[ch.length];*/
       String newstr="";
       for(int i=0;i<=str.length()-1;i++) {
    	   if(!newstr.contains(str.charAt(i)+"")) {
    		 
    		   newstr = newstr+str.charAt(i);
    	   }
       }
       System.out.print(newstr);
	}

}
