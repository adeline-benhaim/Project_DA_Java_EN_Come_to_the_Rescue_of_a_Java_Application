package com.hemebiotech.analytics;
import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Export Treemap to File with the occurrence of each symptom
 * The important part is, the return of key sorted in alphabetical order (String : symptom) with his value (Integer : number of occurrences)
 *
 */
public interface ISymptomExport {

    File exportFile(TreeMap<String,Integer>myTreeMap) throws IOException;
}
