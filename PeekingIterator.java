import java.util.Iterator;

/**
 * Leetcode 284. Peeking Iterator
 * Link: https://leetcode.com/problems/peeking-iterator/description/
 */
public class PeekingIterator implements Iterator<Integer> {
    /**
     * Since no built-in iterator method supports reading next Element without incrementing
     * iterator pointer, we have to use extra variable to hold the Element whenever peek is
     * called and we use this variable as our pointer of the peekingIterator
     *
     * TC: O(n)
     * SC: O(1)
     */
    Integer peekInt;
    Iterator<Integer> basicItr;
    public PeekingIterator(Iterator<Integer> iterator) {
        this.basicItr = iterator;
        this.peekInt = basicItr.next();
    }

    public Integer peek() {
        return peekInt;
    }

    @Override
    public Integer next() {
        Integer temp = peekInt;
        peekInt = null;
        if (basicItr.hasNext()) {
            peekInt = basicItr.next();
        }
        return temp;
    }

    @Override
    public boolean hasNext() {
        return peekInt != null;
    }
}
