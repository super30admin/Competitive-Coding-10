// https://leetcode.com/problems/peeking-iterator/

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, in peek function, if has peek is false and iter.hasNext() is true, take iter.next() as peekedElement and hasPeek to true and return
 * peekedElement. In next function if hasPeek is true make it false and return peekedElement else return iter.next(). In hasnext function,
 * return haspeek|| iter.hasNext().
 */

class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> itr = null;
    private Integer nextVal = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.

        itr = iterator;

        if(hasNext()) {
            nextVal = itr.next();
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextVal;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer temp = nextVal;

        if(itr.hasNext()) {
            nextVal = itr.next();
        } else {
            nextVal = null;
        }

        return temp;
    }

    @Override
    public boolean hasNext() {
        return nextVal != null || itr.hasNext();
    }
}