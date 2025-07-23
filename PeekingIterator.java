// Time complexity - O(1)
// space complexity - O(1)
// solved on leetcode - yes
// faced any issues - No
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextElement;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        // Preload the first element
        if (iterator.hasNext()) {
            nextElement = iterator.next();
        }
    }

    // Returns the next element without advancing the iterator
    public Integer peek() {
        return nextElement;
    }

    // next() should return the buffered element, and advance the iterator
    @Override
    public Integer next() {
        Integer current = nextElement;
        nextElement = iterator.hasNext() ? iterator.next() : null;
        return current;
    }

    @Override
    public boolean hasNext() {
        return nextElement != null;
    }
}
