package com.hemebiotech.analytics;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * FileSymptomReader implement the interface ISymptomReader
 * @see ISymptomReader
 */
public class FileSymptomReader implements ISymptomReader {

	private final String filepath;

	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public FileSymptomReader(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * Extracts symptoms data from a file
	 * @return an ArrayList of String, representing the symptoms read.
	 */
	@Override
	public ArrayList<String> getSymptoms() {

		ArrayList<String> symptoms = new ArrayList<>();

		try {
			//Read the input file
			FileInputStream file = new FileInputStream(filepath);
			Scanner scanner = new Scanner(file);
			//Returns true as long as there are lines to read
			while (scanner.hasNextLine()) {
				symptoms.add(scanner.nextLine());
			}
			scanner.close();
			//Display of the call stack for debugging in case of exception
		} catch (IOException e) {
			e.printStackTrace();
		}
		return symptoms;
	}
}
