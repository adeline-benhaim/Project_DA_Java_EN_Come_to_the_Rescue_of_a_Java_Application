package com.hemebiotech.analytics;
import java.util.ArrayList;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a Arraylist of strings,
 * that may contain many duplications
 *
 * The implementation does not need to order the Arraylist
 *
 */
public interface ISymptomReader  {

	/**
	 * If no data is available, return an empty List
	 */

	ArrayList<String> getSymptoms();

}

