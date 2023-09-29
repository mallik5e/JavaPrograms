package PatterPrograms;
import java.util.Scanner;
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n value: ");
		int n = scan.nextInt();
		System.out.println("enter the value: ");
		char ch = scan.next().charAt(0);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i*2-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==5 || i==4 && j==1 || i==3 && j==1 || i==2 && j==1 || i==1) {
					System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
			}
			for(int k=2;k<=n;k++) {
				if(i==5 || i==4 && k==4 || i==3 && k==3 ||i==2 && k==2) {
					System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
