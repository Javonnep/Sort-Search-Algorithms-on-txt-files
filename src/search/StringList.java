package search;

/**
 * Interface to a list of strings in ascending order.
 * Do NOT change anything in this file.
 */
public interface StringList {

    /**
     * Returns the number of elements in this list.
     * This method takes constant time.
     * @return the number of elements in this list
     */
    public int size();

    /**
     * Returns the element at the specified position in this list.
     * This method takes constant time.
     * @param i position in the list, between 0 and size()-1
     * @return the element at the position i
     */
    public String get(int i);
}