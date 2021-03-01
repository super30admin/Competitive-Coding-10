import java.util.Iterator;
// Time Complexity :O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

public class PeekingIteratorr {
    class PeekingIterator implements Iterator<Integer> {

        private Iterator<Integer> itr = null;// declare itr variable
        private Integer nextElement = null;// next element value

        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            itr = iterator;
            if(hasNext()) nextElement = itr.next();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return nextElement;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer temp = nextElement;
            if(itr.hasNext()){
                nextElement = itr.next();
            }else{
                nextElement = null;
            }
            return temp;
        }

        @Override
        public boolean hasNext() {
            return nextElement != null || itr.hasNext();
        }
    }


}
