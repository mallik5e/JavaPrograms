package Arrays;
import java.util.Scanner;
public class LcmProgram {
 //LCM PROGRAM
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan = new Scanner(System.in);
          int num1 = scan.nextInt();
          int num2 = scan.nextInt();
          int res = Math.max(num1, num2);
          while(true) {
        	  if(res%num1==0 && res%num2==0) {
        		
        		 break;
        	  }
        	  res++;
          }
          System.out.println(res);
	}

}
