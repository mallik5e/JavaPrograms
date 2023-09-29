package StringProject;
import java.util.Scanner;
public class prog16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
         String str = scan.nextLine();
         int Uppercase=0, Lowercase=0, number=0, specialCharacter=0;
         String Uppercase1="", Lowercase1="", number1="", specialCharacter1="";
         for(int i=0;i<=str.length()-1;i++) {
        	 char c=str.charAt(i);
        	 if(c>='A' && c<='Z') {
        		 Uppercase1=Uppercase1+c;
        		
        		 Uppercase++;
        	 }
        
        	 else if(c>='a' && c<='z') {
        	     Lowercase1=Lowercase1+c;
        		 Lowercase++;
        	 }
        	 else if(c>='1' && c<='9') {
                  
        		 number++;
        		 number1=number1+c;
        	 }
        	 else {
        		 specialCharacter1=specialCharacter1+c;
        		 specialCharacter++;
        	 }
         }
         System.out.println("count of Uppercase: "+Uppercase);
         System.out.println("Uppercase letters: "+Uppercase1+" ");
         System.out.println("count of Lowercase: "+Lowercase);
         System.out.println("Lowercase letters: "+Lowercase1+" ");
         System.out.println("count of number: "+number);
         System.out.println("numbers are: "+number1+" ");
         System.out.println("count of specialCharacter: "+specialCharacter);
         System.out.println("specialCharacter are: "+specialCharacter1+" ");
	}

}
