// Time Complexity: O(1) for hasNext, next and peek
// Space Complexity: O(1) very limited elements in stack
// Idea here is to use abilities of iterator. Here we are concerned only for current element
// On performing peek we just check if we already have an element in stack to peek,
// else with out moving iterator to next element we add next into stack so that if any consecutive peek is done
// it happens from stack in O(1)
// hasNext just check if there is any value that exists in stack or iterator then it returns true
// on next, if there are any values in stack it is popped and returned else iterator next is returned
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Stack<Integer> stack;
    Iterator it;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.stack = new Stack<>();
        this.it = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(stack.isEmpty()) stack.push((int)it.next());
        return stack.peek();
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(!stack.isEmpty()) return stack.pop();
        return (int)it.next();
	}
	
	@Override
	public boolean hasNext() {
        return !stack.isEmpty() || it.hasNext();    
	}
}