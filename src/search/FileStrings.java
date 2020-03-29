package search;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class holding an arraylist of strings in ascending order.
 * Do NOT change anything in this class.
 */
public class FileStrings implements StringList {
    /** Underlying list of elements */
    private final ArrayList<String> elements;

    /** Number of calls to get() since the last call to resetCount() */
    private int count;

    /**
     * Create a list containing the lines of a text file.
     * @param fileName name of a text file of strings, in order
     * @throws java.io.IOException on input error
     */
    public FileStrings(String fileName) throws IOException {
        elements = new ArrayList<>();
        try (BufferedReader input = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = input.readLine()) != null) {
                elements.add(line);
            }
        }
        count = 0;
    }

    /**
     * Returns the number of elements in this list.
     * This method takes constant time.
     * @return the number of elements in this list
     */
    @Override
    public int size() {
        return elements.size();
    }

    /**
     * Returns the element at the specified position in this list.
     * This method takes constant time.
     * @param i position in the list, between 0 and size()-1
     * @return the element at the position i
     */
    @Override
    public String get(int i) {
        count++;
        return elements.get(i);
    }

    /**
     * Reset the count field.
     */
    public void resetCount() {
        count = 0;
    }

    /**
     * Getter for count.
     * @return number of calls to get() since the last resetCount()
     */
    public int getCount() {
        return count;
    }
}
