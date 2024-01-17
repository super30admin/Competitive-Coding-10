// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iterator;
    Integer cache;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
        if(this.iterator.hasNext())
            this.cache = this.iterator.next();
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return this.cache;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        int old = this.cache;
        if(this.iterator.hasNext()){
            this.cache = this.iterator.next();
        }else{
            this.cache = null;
        }
        return old;
	    
	}
	
	@Override
	public boolean hasNext() {
        return this.cache != null;
	    
	}
}