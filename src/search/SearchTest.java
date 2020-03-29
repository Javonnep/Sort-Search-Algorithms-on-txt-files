package search;

import search.FileStrings;

import java.io.IOException;

/**
 * Test program for the search.Search class.
 */
public class SearchTest {

    /**
     * Test program for the search.Search class.
     * Put whatever tests you like in the body of the method.
     * @param args the command line arguments
     * @throws java.io.IOException of error reading the input
     */
    public static void main(String[] args) throws IOException {
        // Don't change this line
        final Search search = new Search();

        // You can set this to any of the text files in the data folder
        final FileStrings strings = new FileStrings("data/tiny.txt");



        // add your tests here
        System.out.println(search.longestWord(strings));
        System.out.println(search.countUnique(strings));
        System.out.println(search.findElement(strings, "the"));
        System.out.println(search.findElement(strings, "ziggurat"));
        System.out.println(search.countGreaterOrEqual(strings, "its"));
        System.out.println(search.countGreaterOrEqual(strings, "orange"));





    }

}
