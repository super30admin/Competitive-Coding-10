// Time Complexity : The time complexity is O(1)
// Space Complexity : The space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {

    //global variable that stores the next element
    Integer cur;
    Iterator<Integer> iterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        cur = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return cur;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int val = cur;
        //return the global element and update the global current
        if(iterator.hasNext()){
            cur = iterator.next();
        }
        else{
            cur = null;
        }
        return val;
    }

    @Override
    public boolean hasNext() {
        if(iterator.hasNext() || cur!=null){
            return true;
        }
        else{
            return false;
        }
    }
}