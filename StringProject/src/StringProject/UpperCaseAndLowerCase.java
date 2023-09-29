package StringProject;
import java.util.Scanner;
public class prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
         String str = scan.nextLine();
         char []ch = str.toCharArray();
         int Uppercase=0;
         int lowercase=0;
         for(int i=0;i<=ch.length-1;i++) {
         
         if(ch[i]>='A' && ch[i]<='Z') {
        	 Uppercase++;
         }
         else {
        	 lowercase++;
         }
	}
         System.out.println("uppercase= "+Uppercase);
         System.out.println("lowercase= "+lowercase);
	}
}
