// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


import java.util.Arrays;
import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    private Integer next = null;
    private Iterator<Integer> iter;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
        if (iter.hasNext()) {
            next = iter.next();
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
        Integer res = next;
        next = iter.hasNext() ? iter.next() : null;
        return res;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

   
    public static void main(String[] args) {
       
        Integer[] array = {1, 2, 3};
        PeekingIterator peekingIterator = new PeekingIterator(Arrays.asList(array).iterator());

        while (peekingIterator.hasNext()) {
            System.out.println("Next: " + peekingIterator.next());
            System.out.println("Peek: " + peekingIterator.peek());
            System.out.println("Next: " + peekingIterator.next());
            System.out.println("Next: " + peekingIterator.next());
            System.out.println("HasNext: " + peekingIterator.hasNext());
        }
    }
}
