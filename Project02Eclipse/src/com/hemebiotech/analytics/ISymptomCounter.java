package com.hemebiotech.analytics;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Create a TreeMap with the content of the symptom ArrayList as setting
 * The important part is, the return of key (String : symptom) value (Integer : number of occurrences)
 *
 * The TreeMap sorts symptoms(key) alphabetically
 *
 */
public interface ISymptomCounter {

    /**
     * If no data is available, return an empty TreeMap
     */
    TreeMap<String,Integer> countSymptoms(ArrayList<String> myList);

}
