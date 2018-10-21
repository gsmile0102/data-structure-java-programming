package start;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(reverseWords("Hello world my name is James"));
	}
	
	public static String reverseWords(String sentence) {
		List<String> words = Arrays.asList(sentence.split("\\s"));
		Collections.reverse(words);
		StringBuilder sb = new StringBuilder(sentence.length());
		
		for(int i = 0; i < words.size(); i++) {
			sb.append(words.get(i));
			sb.append(' ');
		}
		
		return sb.toString().trim();
	}

}
