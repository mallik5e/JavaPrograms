package PatterPrograms;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the n value: ");
        int n = scan.nextInt();
        System.out.println("enter the value: ");
        char p = scan.next().charAt(0);
        //for printing the rows
/* for(int i=1;i<=n;i++){
        	//for printing the character to each row
        	for(int j=1;j<=n;j++) {
        		System.out.print(p);    	
        		}
        	//sending cursor to the next line
        	System.out.println();   
        }*/
   /*   int i=1;
        
        while(i<=n){
        	int j=1;
        	while(j<=n){
        		System.out.print(p);
        		j++;
        	}
        	System.out.println();
        	i++;
        } */
        
        int i=1;
        do {
        	
        	int j=1;
        	do {
        		System.out.print(p);
        		j++;
        	}while(j<=n);
        	System.out.println();
        	i++;
        	
        }while(i<=n);
	}
}
