package start;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();
		return s.equals(stringBuilder.toString());
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		System.out.println(s + " is a Palindrome? " + isPalindrome(s));
		
	}

}
