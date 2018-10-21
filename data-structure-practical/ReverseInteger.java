package start;

import java.util.Scanner;

public class ReverseInteger {
	
	public static int ReverseInt(int n) {
		int check = n;
		if (n < 0) {
			check = check * -1;
		}
		
		StringBuilder stringBuilder = new StringBuilder(String.valueOf(check));
		stringBuilder.reverse();
//		if (n < 0) {
//			return Integer.parseInt(stringBuilder.toString()) * -1;
//		}
//		return Integer.parseInt(stringBuilder.toString());
		
		return (int) (Integer.parseInt(stringBuilder.toString()) * Math.signum(n));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a integer to reverse: ");
		int s = input.nextInt();
		
		System.out.println("Reverse of " + s + " is " + ReverseInt(s));
	}

}
