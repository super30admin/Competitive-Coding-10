
// Time - O(1)
// Space - O(1)

import java.util.NoSuchElementException;


class PeekingIterator implements Iterator<Integer> {

    Iterator<Integer> iterator;

    Integer peekValue = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.

        this.iterator = iterator;

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {

        if(peekValue == null) {

            // check if the iterator has next value if it has assign it to peekvalue
            if(!iterator.hasNext()) {
                throw new NoSuchElementException();
            }

            peekValue = iterator.next();


        }

        return peekValue;


    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {

        if(peekValue != null) {

            Integer toReturn = peekValue;
            peekValue = null; // make peekValue null after assigning toReturn for next element to process

            return toReturn;

        }


        if(!iterator.hasNext()) { // if iterator has next value
            throw new NoSuchElementException();
        }

        return iterator.next();

    }

    @Override
    public boolean hasNext() {
        // check if peekValue has value and also check if iterator has next element
        return peekValue != null || iterator.hasNext();

    }
}