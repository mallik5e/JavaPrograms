package StringProject;

public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 = "JAVA";
       String s2 = new String("java");
       if(s1 == s2) {
    	   System.out.println("reference is equal");
       }
       else {
    	   System.out.println("reference is not equal");
       }
       
       if(s1.equals(s2) ) {
    	   System.out.println("String value is equal");
    	   
       }
       else {
    	   System.out.println("String value is not equal");
       }
       
       if(s1.equalsIgnoreCase(s2)) {
    	   System.out.println("string is equal");
       }
       else {
    	   System.out.println("string is not equal");
       }
	}

}
