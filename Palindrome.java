package lab06;

public class Palindrome {
	public static void main (String[]args) {
		System.out.println (isPalindrome(""));
		System.out.println(isPalindrome("hh"));
		System.out.println(isPalindrome("abc"));
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("A man, a plan, a canal, Panama!"));
	}
		public static boolean isPalindrome(String str) {
			String type="";
			for(int x= str.length()-1;x>=0;x--) {
				type = type + str.charAt(x);
			}
			if(str.contentEquals(type)) {
				return true;
			}else {
				return false;
			}		
	}
}