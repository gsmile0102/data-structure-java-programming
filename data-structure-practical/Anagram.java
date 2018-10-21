package start;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(anagram1("rail safety", "fairy tales"));
		System.out.println(anagram2("rail safety", "fairy tales"));
	}
	
	public static boolean anagram1(String word, String anagram) {
		char[] charWord = word.toCharArray();
		char[] charAnagram = anagram.toCharArray();
		
		Arrays.sort(charWord);
		Arrays.sort(charAnagram);
		
		return Arrays.equals(charWord, charAnagram);
	}
	
	public static boolean anagram2(String first, String second) {
		char[] charWord = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);
		
		for(char ch: charWord) {
			int index = sbSecond.indexOf("" + ch);
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			}
			else {
				return false;
			}
		}
		
		return sbSecond.length() == 0 ? true : false;
	}

}
