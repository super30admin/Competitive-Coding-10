// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
We create a new iterator on top of the existing iterator and assign it. We also maintain a nextElement which
helps us get the next value of our iterator.Both the peek and hasNext methods can be implemented using this
nextElement presence. For next method, we get the current nextElement and return it and before we return, we
make it increment to next element of the iterator if applicable, or else, make it null.
 */

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer nextEl;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.itr = iterator;
        nextEl = itr.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextEl;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer temp = nextEl;
        nextEl = null;
        if(itr.hasNext()) {
            nextEl = itr.next();
        }
        return temp;
    }

    @Override
    public boolean hasNext() {
        return nextEl != null;
    }
}