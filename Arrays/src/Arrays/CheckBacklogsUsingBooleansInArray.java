package Arrays;
import java.util.Scanner;
public class CheckBacklogsUsingBooleansInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	       boolean []arr = new boolean[n];
	       
	       for(int i=0;i<=arr.length-1;i++) {
	    	   System.out.println("is any backlog in semester"+(i+1));
	    	   arr[i]=scan.nextBoolean();
	       }
	       
	      for(int i=0;i<=arr.length-1;i++) {
	    	   if(arr[i]==true) {
	    		   
	    	   
	    	   System.out.println("any backlog in semester"+(i+1)+" " +"is"+" " + "yes");
	    	   }
	    	   else {
	    		   System.out.println("any backlog in semester"+(i+1)+" " +"is"+" " + "no");
	    	   }
	       }
	}

}


 /* if(arr[i]==true){
  arr[i]=yes;
  }
  else{
  arr[i]=no;
  }
  for(int i=0;i<=arr.length-1;i++) {
   System.out.println("any backlog in semester"+(i+1)+" " +"is"+" " + arr[i]);
	    	   }
	    	   }
	    	   }
  */
 