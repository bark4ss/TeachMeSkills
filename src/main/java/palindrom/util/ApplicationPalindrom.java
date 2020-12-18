package palindrom.util;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ApplicationPalindrom {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String src = "text.txt";
		String dest = "filteredText.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {
			String line = TextFormatter.concatLines(src).replaceAll("( )+", " ");
			String[] sentences = line.split("\\.");
			for (String string : sentences) {
				int countWords = TextFormatter.countWords(string.strip());
				if (TextFormatter.isSentenceContainsPalindrom(string.strip()) || (countWords >= 3 && countWords <= 5)) {
					writer.append(string.strip()).append(".");
					writer.newLine();
				}
			}
		}

	}

}
