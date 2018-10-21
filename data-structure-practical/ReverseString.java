package start;

public class ReverseString {
	
	public static String reverse(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}
	
	public static String reverse2(String s) {
		String[] strArray = s.split("");
		String reversed = "";
		
		for(int i = 0; i < strArray.length; i++) {
			reversed = strArray[i] + reversed; 
		}
		
		return reversed;
	}

	public static void main(String[] args) {
		String s = "abcdef";
		
		System.out.println("Reverse of " + s + " is " + reverse2(s));
	}

}
