// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer n=null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    itr=iterator;
        if(itr.hasNext()){
            n=itr.next();
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return n;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int temp=n;
        if(itr.hasNext()){
            n=itr.next();
        }else{
            n=null;
        }
        return temp;
	}
	
	@Override
	public boolean hasNext() {
	    return n!=null;
	}
}