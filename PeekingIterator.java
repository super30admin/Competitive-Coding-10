// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

/*
To implement the peek iterator,
We need to think of some method to cache the next element. 
Here what we can do is, whenever peek is called we will just move the poniter to next.
Save this number is cache and update this cache whenever next is called. 

p

time complexity: O(1) for peek, next and hasnext
space complexity :O(1)

*/

class PeekingIterator implements Iterator<Integer> {
    Integer peekNum;
    Iterator<Integer> itr;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.peekNum = 0;
        this.itr = iterator;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        
        //first check if peeknum is zero,
        //if yes, update the peeknum by doing itr.next().
        if(this.peekNum == 0){
            if(this.itr.hasNext()){
            this.peekNum = this.itr.next();
             }
        }
        return peekNum;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        //first check if peeknum is not zero
        //if true, then save the peeknum is different variable in order to return and reset
        //peeknum to 0
        //else, do itr.next and return the num
        
	    if(peekNum != 0){
            Integer toReturn   = peekNum;
            peekNum = 0;
            return toReturn;
        }
        if(this.itr.hasNext()){
           return itr.next();
        }
        return null;
	}
	
	@Override
	public boolean hasNext() {
        //since we are always moving ahead due to peek operation
        //we check noth hasnext and peeknum before returning the result
	    return ((this.itr.hasNext() || this.peekNum != 0) ? true : false);
	}
}