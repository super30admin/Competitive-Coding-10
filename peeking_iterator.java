// Time Complexity : O(1) for peek(), next(), and hasNext()
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// We store the next element in advance so peek() can return it without moving the iterator.
// next() returns the stored value and immediately fetches the following element.
// hasNext() simply checks whether a prefetched value is available.

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iterator;
    Integer nextVal;
    boolean hasPeeked;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        advance();
    }

    // prefetch next element
    private void advance() {
        if(iterator.hasNext()) {
            nextVal = iterator.next();
            hasPeeked = true;
        } else {
            nextVal = null;
            hasPeeked = false;
        }
    }

    // return next element without advancing
    public Integer peek() {
        return nextVal;
    }

    @Override
    public Integer next() {
        int ans = nextVal;
        advance();
        return ans;
    }

    @Override
    public boolean hasNext() {
        return hasPeeked;
    }
}