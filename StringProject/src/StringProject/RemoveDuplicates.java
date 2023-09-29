package StringProject;
import java.util.Scanner;
public class prog10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      char []ch = str.toCharArray();
      String newstr="";
      for(int i=0;i<=ch.length-1;i++) {
      if(!newstr.contains(str.charAt(i)+"")) {
    	  newstr = newstr + str.charAt(i);
    	  
    	  }
     
	}
      System.out.println(newstr);
      
  }
	
}
