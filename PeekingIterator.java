// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

// TIme Complexity for peek, next, hasNext is O(1)
// Space COmplexity: O(1)

// class PeekingIterator implements Iterator<Integer> {
// 	Iterator<Integer> itr;
//     Integer next;

//     public PeekingIterator(Iterator<Integer> iterator) {
// 	    // initialize any member here.
// 	    this.itr = iterator;
//         if(itr.hasNext()) {
//             next = itr.next();
//         }
// 	}

//     // Returns the next element in the iteration without advancing the iterator.
// 	public Integer peek() {
//         return next;
// 	}

// 	// hasNext() and next() should behave the same as in the Iterator interface.
// 	// Override them if needed.
// 	@Override
// 	public Integer next() {
// 	    Integer res = next;
//         next = itr.hasNext() ? itr.next() : null;
//         return res;
// 	}

// 	@Override
// 	public boolean hasNext() {
// 	    return next != null;
// 	}
// }

// Solution with Exception handling
import java.util.NoSuchElementException;
class PeekingIterator implements Iterator<Integer> {
    Integer next;
    Iterator<Integer> iter;
    boolean noSuchElement;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
        advanceIter();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (noSuchElement)
            throw new NoSuchElementException();
        Integer res = next;
        advanceIter();
        return res;
    }

    @Override
    public boolean hasNext() {
        return !noSuchElement;
    }

    private void advanceIter() {
        if (iter.hasNext()) {
            next = iter.next();
        } else {
            noSuchElement = true;
        }
    }
}