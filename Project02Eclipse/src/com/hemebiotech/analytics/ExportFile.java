package com.hemebiotech.analytics;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * ExportFile implement the interface ISymptomExport
 * @see ISymptomExport
 */
class ExportFile implements ISymptomExport {

    private final String fileExport;

    public ExportFile(String fileExport) {

        this.fileExport = fileExport;
    }

    /**
     * Export a TreeMap to file
     * @return a file of symptoms and number of each occurrences
     */
    @Override
    public File exportFile(TreeMap<String, Integer> myTreeMap) throws IOException {

        //The current date and time
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        //Create the file if it does not exist, or replaces the existing
        File file = new File(fileExport);
        FileWriter out = new FileWriter(file);
        out.write("Export of " + s.format(date) + "\n" + "\n");
        for (Map.Entry<String, Integer> entry : myTreeMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            out.write(key +" = "+value +"\n");
        }
        out.close();
        System.out.println("Successful export !" + "\n" + s.format(date));
        return file;
    }
}