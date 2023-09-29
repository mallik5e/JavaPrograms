package PatterPrograms;
import java.util.Scanner;
public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n value: ");
		int n = scan.nextInt();
		int OddCount=1;
		int EvenCount=2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+2;j++) {
				if(EvenCount<10) {
					System.out.print("0");
				}
				System.out.print(EvenCount+" ");
				EvenCount=EvenCount+2;
			}
			System.out.println();
	}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+2;j++) {
				if(OddCount<10) {
					System.out.print("0");
				}
				System.out.print(OddCount+" ");
				OddCount=OddCount+2;
			}
			System.out.println();
	}

	}

}
