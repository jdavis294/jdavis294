package lab06;

public class PlaywithStrings {

	public static void main(String[]args) {
		
        String test = "This is a test.";
        int stringlength = test.length();
        for(int test1=0; test1<stringlength;test1++) {
        	System.out.print(test.charAt(test1));
        }
        System.out.println();
        System.out.println();
        
      //number 4
      String revStr="";
		for(int i = test.length()-1; i>=0; i--) {
			revStr += test.charAt(i);
		}
		System.out.println(revStr);
	}
}