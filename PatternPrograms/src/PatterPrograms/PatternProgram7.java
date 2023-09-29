package PatterPrograms;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {  //for(int j=1;j<=(n-i+1);j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		//while loop
	/*	int i=1;
		while(i<=5) {
			int j=5;
			while(j>=i) {
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}*/
		
		//do while
		int i=1;
		do {
			int j=5;
			do {
				System.out.print("*");
				j--;
			}while(j>=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
