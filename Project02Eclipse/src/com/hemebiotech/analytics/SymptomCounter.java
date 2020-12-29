package com.hemebiotech.analytics;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * SymptomCounter implement the interface ISymptomCounter
 * @see ISymptomCounter
 */
class SymptomCounter implements ISymptomCounter {

    /**
     * Extracts symptoms String from a ArrayList
     * @return a TreeMap of String(Symptoms) and Integer(number of occurrences)
     */
    @Override
    public TreeMap<String,Integer> countSymptoms(ArrayList<String> myList) {

        TreeMap<String,Integer> map = new TreeMap<>();
        int i;
        for (i = 0; i < myList.size(); i++) {
            int occurrence;
            String symptom;
//          The symptom string is converted to lowercase to avoid duplicates
            symptom = myList.get(i).toLowerCase();
//          If the line is empty it identifies as no symptoms
            if (symptom.equals("")) {
                symptom = "no symptoms";
            }
            if (map.containsKey(symptom)) {
                occurrence = map.get(symptom);
                occurrence++;
            } else occurrence = 1;
            map.put(symptom, occurrence);
        }
        return map;
    }
}
