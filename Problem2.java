// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html


// Time Complexity : O(1) for all methods
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * Use the next method to move the iterator to next element and save the upcoming element. Saving the next element in the memory so that calling hasNext and peek won't move the pointers.
 */
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> it;
    Integer next;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.it = iterator;
        // initializing the first element so that when next is called, first element will be stored
        if (it.hasNext()) {
            next = it.next();
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        // save the temp element that will be returned
        Integer temp = next;

        // find the next element from iterator and set it to next
        if (it.hasNext()) {
            next = it.next();
        } else {
            next = null;
        }

        return temp;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}