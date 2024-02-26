// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {

    Iterator<Integer> iterator; 
    Integer cache = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(this.cache == null) this.cache = this.iterator.next();
        return this.cache;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer result = this.cache != null ? this.cache : (this.iterator.hasNext() ? this.iterator.next() : null);
	    this.cache = this.iterator.hasNext() ? this.iterator.next() : null;
        return result;
	}
	
	@Override
	public boolean hasNext() {
        return this.cache != null || this.iterator.hasNext();
	}
}
