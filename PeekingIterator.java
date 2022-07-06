// Time Complexity :O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
class PeekingIterator implements Iterator<Integer> {
    private Integer cache;
    Iterator<Integer> iterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        // initializing the iterator and cache
        this.iterator = iterator;
        cache = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        // no movement will be there in peek just return chache
        return cache;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        // we'll store cache as we need to change the cache to nect ele
        Integer result = cache;
        // we need to check hasnext also as we are one step ahead
        if (iterator.hasNext()) {
            cache = iterator.next();
        } else {
            cache = null;
        }

        return result;
    }

    @Override
    public boolean hasNext() {
        // we should only check cache in hasnext
        if (cache != null) {
            return true;
        }
        return false;
    }
}