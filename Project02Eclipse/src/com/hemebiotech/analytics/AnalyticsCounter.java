package com.hemebiotech.analytics;
import java.util.*;

public class AnalyticsCounter {

	public static void main(String[] args) {

		ISymptomReader fileReader = new FileSymptomReader("Project02Eclipse/symptoms.txt");
		ArrayList<String> result = fileReader.getSymptoms();
        System.out.println(result);
	}
}