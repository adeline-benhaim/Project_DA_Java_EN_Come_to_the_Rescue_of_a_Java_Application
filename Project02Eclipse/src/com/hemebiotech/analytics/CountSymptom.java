package com.hemebiotech.analytics;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * CountSymptom implement the interface ISymptomCounter
 * @see ISymptomCounter
 */
class CountSymptom implements ISymptomCounter {

    /**
     * Extracts symptoms String from a ArrayList
     * @return a TreeMap of String(Symptoms) and Integer(number of occurrences)
     */
    @Override
    public TreeMap<String,Integer> countSymptoms(ArrayList<String> myList) {

        TreeMap<String,Integer> table = new TreeMap<>();
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
            if (table.containsKey(symptom)) {
                occurrence = table.get(symptom);
                occurrence++;
            } else occurrence = 1;
            table.put(symptom, occurrence);
        }
        return table;
    }
}
