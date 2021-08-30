import java.util.NoSuchElementException;
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iter;
    Integer peekedVal = null;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(peekedVal == null){
            if(!iter.hasNext()){
                throw new NoSuchElementException();
            }
            peekedVal = iter.next();
        }
        return peekedVal;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(peekedVal != null ){
            Integer next = peekedVal;
            peekedVal = null;
            return next;
        }
        if(!iter.hasNext()){
            throw new NoSuchElementException();
        }
        return iter.next();

    }

    @Override
    public boolean hasNext() {
        return peekedVal != null || iter.hasNext();
    }
}