// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
//Time Complexity-O(1)
//Space Complexity-O(1)
class PeekingIterator implements Iterator<Integer> {
    int temp=Integer.MAX_VALUE;
    Iterator<Integer>iterator;
	public PeekingIterator(Iterator<Integer> iterator) {
	    this.iterator=iterator;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(hasNext())
        {
            if(temp==Integer.MAX_VALUE)
            {
                temp=next();
            }
        }
        return temp;
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if(temp!=Integer.MAX_VALUE)
        {
           int n=temp;
           temp=Integer.MAX_VALUE;
            return n;
        }
        return iterator.next();
	    
	}
	
	@Override
	public boolean hasNext() {
        return temp!=Integer.MAX_VALUE||iterator.hasNext();
	    
	}
}