package PatterPrograms;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		//while loop
	/*	int i=1;
		while(i<=5) {
			int j=1;
			while(j<=10) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}*/
		// do while
		int i=1;
		do {
			int j=1;
			do {
				System.out.print("*");
				j++;
			}while(j<=10);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
