// Time Complexity : O(1)
// Space Complexity : 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

//https://leetcode.com/problems/peeking-iterator/
class PeekingIterator implements Iterator<Integer> {
    Queue<Integer> queue;
    Iterator<Integer> iterator;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.queue = new LinkedList<>();
        this.iterator = iterator;
        
        if(iterator.hasNext()){
            queue.add(iterator.next());
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(!queue.isEmpty()) {
            return queue.peek();
        }else{
            return -1;
        }
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(this.hasNext()) {
            int val = queue.remove();
            
            if(iterator.hasNext()){
                queue.add(iterator.next());
            }
            
            return val;
        }else {
            return -1;
        }
	}
	
	@Override
	public boolean hasNext() {
	    return !queue.isEmpty();
	}
}