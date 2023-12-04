// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class PeekingIterator {
    class PeekingIterator implements Iterator<Integer> {
        private Iterator<Integer> it;
        private Integer nextEle;
        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.it = iterator;
            this.nextEle = null;
            //***** cache it before peek ****//
            next();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return nextEle;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer interRe = nextEle;
            nextEle = null;

            if(it != null && it.hasNext()){
                nextEle = it.next();
            }
            return interRe;
        }

        @Override
        public boolean hasNext() {
            return nextEle != null;
        }
    }
}
