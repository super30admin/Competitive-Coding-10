import java.util.*;

class PeekingIterator implements Iterator<Integer> {
    Integer nextEle;
    Iterator<Integer> iterator;
    public PeekingIterator(Iterator<Integer> iterator) {
        nextEle=iterator.next();
        this.iterator=iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextEle;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer prev=nextEle;
        if(iterator.hasNext())
            nextEle=iterator.next();
        else
            nextEle=null;
        return prev;
    }

    @Override
    public boolean hasNext() {
        return nextEle!=null;
    }
}