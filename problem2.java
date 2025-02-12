import java.util.Iterator;

public class problem2 {

    // Time Complexity: O(1)
    //Space Complexity: O(1)

    class PeekingIterator implements Iterator<Integer> {
        private Iterator<Integer> iterator;
        private Integer nextElement;

        public PeekingIterator(Iterator<Integer> iterator) {
            this.iterator = iterator;
            this.nextElement = iterator.hasNext() ? iterator.next() : null;
        }

        public int peek()
        {
            return nextElement;
        }

        @Override
        public boolean hasNext() {
            return nextElement != null;
        }

        @Override
        public Integer next() {
            if (nextElement == null)
            {
                return null;
            }
            Integer res = nextElement;
            nextElement= iterator.hasNext() ? iterator.next() : null;
            return res;
        }

    }
}
