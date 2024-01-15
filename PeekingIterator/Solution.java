// Time Complexity : All methods : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/**
 * Saving next value
 */

import java.util.NoSuchElementException;
class PeekingIterator implements Iterator<Integer> {

    Iterator<Integer> iter;
    Integer next = null;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        if(iterator.hasNext())
            next = iterator.next();
        iter = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(next == null) throw new NoSuchElementException();
        Integer result = next;
        next = null;
        if(iter.hasNext()) next = iter.next();
        return result;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}

/**
 * Saving peek value
 */
// Time Complexity : All methods : O(1)
// Space Complexity : O(1)
import java.util.NoSuchElementException;
class PeekingIterator implements Iterator<Integer> {

    Iterator<Integer> iter;
    Integer peek;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(peek == null) {
            if(!iter.hasNext()) throw new NoSuchElementException();
            peek = iter.next();
        }
        return peek;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(peek == null) {
            if(!iter.hasNext()) throw new NoSuchElementException();
            return iter.next();
        }
        Integer result = peek;
        peek = null;
        return result;
    }

    @Override
    public boolean hasNext() {
        return peek != null || iter.hasNext();
    }
}