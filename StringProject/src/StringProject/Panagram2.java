package StringProject;
import java.util.Arrays;
import java.util.Scanner;
public class Panagram2 {
	public static int indexOf(char str[], int j) {
		for(int i=0;i<=str.length-1;i++) {
			if(str[i]==j) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan = new Scanner(System.in);
           String str = scan.nextLine();
           String str1 = str.toLowerCase();
           char []str2 = str1.toCharArray();
           
           Arrays.sort(str2);
           for(int i=0;i<=str2.length-1;i++) {
        	   System.out.print(str2[i]+" ");
           }
           System.out.println();
           int count=0;
           for(char j='a';j<='z';j++) {
        	       if(indexOf(str2,j)>=0) {
        		   count++;
        	       }
           }
           if(count==26) {
        	   System.out.println("panagram");
           }
           else {
        	   System.out.println("not panagram");
           }
	}

}
