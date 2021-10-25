// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class PeekingIterator implements Iterator<Integer> {
    private final Iterator<Integer> iterator;
    private boolean hasPeeked;
    private Integer peekedElement;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public Integer peek() {
        if (!hasPeeked) {
            hasPeeked = true;
            peekedElement = iterator.next();
        }
        return peekedElement;
    }

    @Override
    public Integer next() {
        if (!hasPeeked) {
            return iterator.next();
        }
        Integer result = peekedElement;
        peekedElement = null;
        hasPeeked = false;
        return result;
    }

    @Override
    public boolean hasNext() {
        return hasPeeked || iterator.hasNext();
    }
}