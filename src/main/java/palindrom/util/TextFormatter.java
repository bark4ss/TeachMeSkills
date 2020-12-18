package palindrom.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFormatter {

	public static String concatLines(String fileName) {
		StringBuilder builder = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return builder.toString();
	}
	
	public static boolean isSentenceContainsPalindrom (String sentence) {
		for (String word : sentence.split(" ")) {
			if (isPalindrom(word)) {
				return true;
			}
		}
		return false;
	}
	
	public static int countWords (String sentence) {
		return sentence.split(" ").length;
	}
	
	public static boolean isPalindrom (String word) {
		StringBuilder builder = new StringBuilder(word);
		
		return builder.reverse().toString().equals(word);
	}
	
	public static String replaceMultipleSpacesIntoOne (String line) {
		return line.replaceAll("( )+", " ");
	}

}
