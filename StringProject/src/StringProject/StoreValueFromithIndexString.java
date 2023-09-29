package StringProject;
import java.util.Scanner;
public class prog12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
         String str = scan.nextLine();
         char []ch = str.toCharArray();
         
       //transversing all character in array
         for(int i=0;i<=ch.length-1;i++) {
        	 //creating new string
        	 String str1="";
        	 //starting from ith index, we are taking all character until the last index
        	 for(int j=i;j<=ch.length-1;j++) {
        		 //concatenating the character in the str1
        		 str1=str1+ch[j];
        		 //printing
        		 System.out.print(str1+" ");
        		 
        	 }
        System.out.println();
        	 
         }
        
         
    /*    for(int i=1;i<=ch.length-1;i++) {
        	 for(int j=1;j<=i;j++) {
        		 System.out.print(ch[j]+" ");
        	 }
        	 System.out.println();
         }
         for(int i=2;i<=ch.length-1;i++) {
        	 for(int j=2;j<=i;j++) {
        		 System.out.print(ch[j]+" ");
        	 }
        	 System.out.println();
         }
         for(int i=3;i<=ch.length-1;i++) {
        	 for(int j=3;j<=i;j++) {
        		 System.out.print(ch[j]+" ");
        	 }
        	 System.out.println();
         }
         for(int i=4;i<=ch.length-1;i++) {
        	 for(int j=4;j<=i;j++) {
        		 System.out.print(ch[j]+" ");
        	 }
        	 System.out.println();
         }
         for(int i=5;i<=ch.length-1;i++) {
        	 for(int j=5;j<=i;j++) {
        		 System.out.print(ch[j]+" ");
        	 }
        	 System.out.println();
         }
         for(int i=6;i<=ch.length-1;i++) {
        	 for(int j=6;j<=i;j++) {
        		 System.out.print(ch[j]+" ");
        	 }
        	 System.out.println();
         }*/
	}

}
