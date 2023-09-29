package PatterPrograms;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n value: ");
		int n = scan.nextInt();
		System.out.println("enter the value: ");
		char p = scan.next().charAt(0);
		/*for(int i=1;i<=n;i++) {
			
			
			System.out.println(p);
		}*/
		//while loop
	/*	int i=1;
		while(i<=n) {
			System.out.println(p);
			i++;
		}*/
		// do while
		int i=1;
		do {
			System.out.println(p);
			i++;
		}
		while(i<=5);
		

	}

}
