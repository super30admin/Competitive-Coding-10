// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Idea is, the iterator,next() function is one step ahead of the normal next() call by storing the element in a variable.
// whenever peek() is called, we'll return the stored number in the variable.
// in next() function, that variable will be replaced by the next number and if no element is present, make it to 0
// hasnext() will check for the condition whether that variable is 0 or present.



// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Integer peek_value;
    private Iterator<Integer> itr;
    private Integer temp;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        if(iterator.hasNext()){
            peek_value = iterator.next();
        }
        itr = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {

        return peek_value;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {

        temp = peek_value;
        peek_value = 0;
        if(itr.hasNext()){
            peek_value = itr.next();
        }
        return temp;
    }

    @Override
    public boolean hasNext() {
        return peek_value!=0;
    }
}