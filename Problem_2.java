// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> it;
    Integer next;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        it =iterator;
        
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        //if(!it.hasNext()) throw new NoSuchElementException();
        if(next==null){
            next=it.next();
        }
        return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if(next!=null){
            Integer value=next;
            next=null;
            return value;
        }
        //next=;
	    return it.next();
	}
	
	@Override
	public boolean hasNext() {
	    if(next!=null) return true;
        return it.hasNext();
	}
}