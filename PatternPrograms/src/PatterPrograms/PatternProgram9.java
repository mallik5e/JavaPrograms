package PatterPrograms;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n value: ");
		int n = scan.nextInt();
		System.out.println("enter the value: ");
		char ch = scan.next().charAt(0);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		
		}

	}

}
