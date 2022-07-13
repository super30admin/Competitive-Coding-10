// Time Complexity : O(1), all methods
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class PeekIterator {
    // Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

    class PeekingIterator implements Iterator<Integer> {

        private Integer next = null;
        private Iterator<Integer> itr = null;
        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            itr = iterator;
            next();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return next;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer returnValue = next;
            next = null;
            if(itr != null && itr.hasNext()) {
                next = itr.next();
            }

            return returnValue;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }
    }
}
