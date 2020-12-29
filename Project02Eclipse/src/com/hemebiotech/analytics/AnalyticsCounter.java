package com.hemebiotech.analytics;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class AnalyticsCounter {

	public static void main(String[] args) throws IOException {

		ISymptomReader fileReader = new FileSymptomReader("Project02Eclipse/symptoms.txt");
		ArrayList<String> result = fileReader.getSymptoms();

		ISymptomCounter counter = new SymptomCounter();
		TreeMap<String,Integer> resultSymptom = counter.countSymptoms(result);

		ISymptomExport fileWriter = new FileSymptomWriter("results.out");
		File out = fileWriter.exportFile(resultSymptom);
	}
}