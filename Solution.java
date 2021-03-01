//Time Complexity:O(1)
//Space Complexity:O(1)
class PeekingIterator implements Iterator<Integer> {
	Iterator<Integer> itr;
    Integer temp;
    public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    itr = iterator;
        temp = itr.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        //return the next element without moving the iterator
       return temp;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	   int val = temp;
        if(itr.hasNext()){
            temp = itr.next();
        }else{
            temp = null;
        }return val;
	}
	
	@Override
	public boolean hasNext() {
	   return temp!=null;
	}
}