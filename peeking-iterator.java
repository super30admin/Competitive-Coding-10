//  TimeComplexity : O(1)
//  SpaceComplexity : O(1)
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Integer nextEl;
    private Iterator<Integer> iter;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iter = iterator;
        if (iterator.hasNext()) {
            this.nextEl = iterator.next();
        }   
	}
	
    // Returns the next element in the iteration without advancing the iterator.
    // TimeComplexity: O(1)
    // SpcaeComplexity: O(1)
	public Integer peek() {
        return this.nextEl;
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
    // TimeComplexity: O(1)
    // SpcaeComplexity: O(1)
	@Override
	public Integer next() {

        Integer result = nextEl;

        if (iter.hasNext()) {
            nextEl = iter.next();
        } else {
            nextEl = null;
        }

        return result;  
	}
	
	@Override
    // TimeComplexity: O(1)
    // SpcaeComplexity: O(1)
	public boolean hasNext() {
        return (this.nextEl!=null);
	    
	}
}