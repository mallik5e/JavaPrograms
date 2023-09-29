package StringProject;
import java.util.Arrays;
import java.util.Scanner;
public class prog14 {
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scan = new Scanner(System.in);
            String name1 = scan.nextLine();
            String name2 = scan.nextLine();
            String newstr1="";
            String newstr2="";
            char []c1 = newstr1.toCharArray();
            char []c2 = newstr2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            for(int i=0;i<=name1.length()-1;i++) {
            if(!newstr1.contains(name1.charAt(i)+"")) {
            	newstr1=newstr1+name1.charAt(i);
            }
            }
            System.out.println(newstr1+" ");
            for(int i=0;i<=name2.length()-1;i++) {
                if(!newstr2.contains(name2.charAt(i)+"")) {
                	newstr2=newstr2+name2.charAt(i);
                }
                }
            System.out.println(newstr2+" ");
           
           for(int i=0;i<=c1.length-1;i++) {
        	   for(int j=0;j<=c2.length-1;j++) {
               	   if(c1[i]==c2[j]) {
               		{
               		   System.out.print(c1[i]+" ");
               	   }
               	   }
               	
              }
        	  
           }
        }
	

}
