/*
class PeekingIterator:
    def __init__(self, iterator):
        self.it = iterator
        self.cached = self.it.next() if iterator.hasNext() else None
        

    def peek(self):
        if self.cached != None:
            return self.cached
        
        

    def next(self):
        old_value = self.cached
        self.cached = self.it.next() if self.it.hasNext() else None     # this hasNext is inbuilt function and not the bottom one
        return old_value
        

    def hasNext(self):
        return self.cached != None
*/

// time - O(1)
// space - O(1)
// logic - defined an iterator object and took first value in a varible so that it would be helpful in peek function
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> it;
    Integer cached;
	public PeekingIterator(Iterator<Integer> iterator) {
	    it = iterator;
        cached = iterator.hasNext()? iterator.next(): null;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if (cached != null)
            return cached;
        return -1;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int old_value = cached;
        cached = it.hasNext()? it.next(): null;         // this hasNext is inbuilt function and not the bottom one
        return old_value;
	}
	
	@Override
	public boolean hasNext() {
	    if (cached != null)
            return true;
        return false;
	}
}