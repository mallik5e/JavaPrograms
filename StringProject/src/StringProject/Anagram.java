package StringProject;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
         String str = scan.next();
         String str1 = scan.next();
         char ch[] = str.toCharArray();
         char cha[] = str1.toCharArray();
         Arrays.sort(ch);
         Arrays.sort(cha);
         if(Arrays.equals(ch,cha)) {
        	 System.out.println("Anagram");
         }
      
        	 
        		
        	 }
         
	}


