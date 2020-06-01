// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.Iterator;
import java.util.NoSuchElementException;

class PeekingIterator implements Iterator<Integer> {

    private final Iterator<Integer> iterator;
    private Integer peekedValue = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        /* If there's not already a peeked value, get one out and store
         * it in the peekedValue variable. We aren't told what to do if
         * the iterator is actually empty -- here I have thrown an exception
         * but in an interview you should definitely ask! This is the kind of
         * thing they expect you to ask about. */
        if(peekedValue == null){
            if(!iterator.hasNext()){
                throw new NoSuchElementException();
            }
            peekedValue = iterator.next();
        }

        return peekedValue;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(peekedValue != null){
            int result = peekedValue;
            peekedValue = null;
            return result;
        }

        if(!iterator.hasNext()){
            throw new NoSuchElementException();
        }

        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return peekedValue != null || iterator.hasNext();
    }
}