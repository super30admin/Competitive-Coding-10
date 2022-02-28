// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html


//time complexity : O(1), as we just return the element
//space complexity : O(1), no extra space
class PeekingIterator implements Iterator<Integer> {

    Integer peek;
    Iterator<Integer> itrObject;

    public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    itrObject = iterator;

        peek = itrObject.next();

	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return peek;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer temp = peek;
        peek = null;
        if(itrObject.hasNext()){
            peek = itrObject.next();
        }

        return temp;

	}

	@Override
	public boolean hasNext() {
	    return peek != null;
	}
}
