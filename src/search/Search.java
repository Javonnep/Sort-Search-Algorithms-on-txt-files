package search;

import java.util.ArrayList;

/**
 * Class of operations on ordered lists of strings.
 * You should fill in the bodies of these methods.
 */
public class Search {

    /**
     * Returns the index of the longest string in the list.
     * If there are several string of this length, the
     * indexed returned is the that of the first.
     * @param a list of strings, in ascending order
     * @return position of an entry with the longest string in the list
     */
    public int longestWord(StringList a) {
        int n = a.size()-1;
        int indexOfLongestWord = 0;
        String longestWord = "";
        for (int i = n; i > 0; i--) {
            if(a.get(i).length() >= longestWord.length()) {
                longestWord = a.get(i);
                indexOfLongestWord = i;
            }
        }
        return indexOfLongestWord;
    }

    /**
     * Returns the number of unique elements in the list
     * @param a list of strings, in ascending order
     * @return number of unique elements in the list.
     */
    public int countUnique(StringList a) {
        ArrayList<String> uniqueWords = new ArrayList<>();
        int n = a.size()-1;
        uniqueWords.add(a.get(0));
        for(int i = 1; i<=n; i++){
            if (uniqueWords.contains(a.get(i))){
                // do nothing
            }
            else{
                uniqueWords.add(a.get(i));
            }
        }
        return uniqueWords.size();
    }

    /**
     * search.Search for a string in an ordered collection
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return position of an element equal to k, if any, otherwise -1
     */
    public int findElement(StringList a, String k) {
        //search for k
        int lo = 0;
        int hi = a.size()-1;
        int targetIndex;
        while ( lo <= hi ){
            int mid = (lo + hi) / 2;

            if (a.get(mid).compareTo(k) == 0 ){
                targetIndex = mid;
                return targetIndex;
            }
            else if (a.get(mid).compareTo(k) < 0){
                lo = mid+1;
            }
            else {
                hi = mid-1;
            }
        }
        return -1;
    }

    public int countGreaterOrEqual(StringList a, String k) {
        int lo = 0;
        int hi = a.size()-1;

        while (lo <= hi){
            int mid = (lo + hi) / 2;
            if (a.get(mid).compareTo(k) < 0){
                lo = mid+1;
            }
            else {
                hi = mid-1;
            }
        }
        return a.size()-lo;
    }
}