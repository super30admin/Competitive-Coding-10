//Time complexity : O(1) as we just return value in cache
//Space Complexity :   O(1) to store cache

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> myItr; Integer cache = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.myItr = iterator;
        if(this.myItr.hasNext())
            cache = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return this.cache;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int currCache = this.cache;
        if(this.myItr.hasNext())
            this.cache = this.myItr.next();
        else
            this.cache = null;
        return currCache;
    }

    @Override
    public boolean hasNext() {
        return (this.cache != null);
    }

}