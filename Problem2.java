//time complexity-O(n)
//Space complexity-O(1)
//Ran on leetcode-Yes
//Solution with comments-
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    int temp;
    Iterator<Integer> itr;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    itr=iterator;
        temp=-1;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(temp==-1)
            temp=itr.next();
        return temp;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	     if(temp==-1)
            return itr.next();
        int x= temp;
        temp=-1;
        return x;
	}
	
	@Override
	public boolean hasNext() {
	    return (temp!=-1 || itr.hasNext());
	}
}