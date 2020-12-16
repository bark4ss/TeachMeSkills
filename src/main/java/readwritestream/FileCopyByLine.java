package readwritestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyByLine {

	public static void main(String[] args) {
		try (BufferedReader fileIn = new BufferedReader(new FileReader("fileBufferedSymbolByLine.txt"));
				BufferedWriter fileOut = new BufferedWriter(new FileWriter("copied_fileBufferedSymbolByLine.txt"));) {

			String line;
			int countLine = 0;
			while ((line = fileIn.readLine()) != null) {
				System.out.println(line);
				fileOut.write(line);
				countLine++;

			}
			System.out.println("=================================");
			System.out.println("Total number of recorded lines: " + countLine);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
