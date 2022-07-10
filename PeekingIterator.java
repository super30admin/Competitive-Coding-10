/**
Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
*/
class PeekingIterator implements Iterator<Integer> 
{
    Iterator<Integer> iterator;
    Integer next;
    
	public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        this.next = this.iterator.next();
	}
	
	public Integer peek() {
        return this.next;
	}
	
	@Override
	public Integer next() {
    
        Integer value = this.next;
        
	    if(this.iterator.hasNext()) {
            this.next = this.iterator.next();
        } else {
            this.next = null;
        }
        
        return value;
	}
	
	@Override
	public boolean hasNext() {
	    return this.next != null;
	}
}