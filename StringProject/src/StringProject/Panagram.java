package StringProject;
import java.util.Scanner;
public class Panagram {
         public static int indexOf(String str, int j) {
        	 for(int i=0;i<=str.length()-1;i++) {
        		 if(str.charAt(i)==j) {
        			 return i;
        		 }
        	 }
        	 return -1;
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan = new Scanner(System.in);
           String str = scan.next();
           str = str.toLowerCase();
           int count=0;
           for(char i='a';i<='z';i++) {
        	   if(indexOf(str,i)>=0){
        		   count++;
        	   }
           }
           System.out.println(count);
           if(count==26) {
        	   System.out.println("panagram");
           }
           else {
        	   System.out.println("not panagram");
           }
	}

}
