// TC : O(1)
// SC : O(1)

// Using Iterator

class PeekingIterator implements Iterator<Integer> {
    
    Integer nextVal = 0;
    Iterator<Integer> itr;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.itr = iterator;
        if(itr.hasNext()){
            nextVal = itr.next();
        }
        
	}
	
	public Integer peek() {
        return nextVal;
       
	}
	
	@Override
	public Integer next() {
        int val = nextVal;
        if(!itr.hasNext()){
            nextVal = null;
        }
        else{
            nextVal = itr.next();
        }
        return val;
    
	}
	
	@Override
	public boolean hasNext() {
	   return nextVal!=null;
	}
}