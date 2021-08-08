package CompetitiveCoding10;

public class PeekingIterator {
	// Java Iterator interface reference:
	// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

	class PeekingIterator implements Iterator<Integer> {
	    
	    Iterator<Integer> i = null;
	    Integer temp = null;
		public PeekingIterator(Iterator<Integer> iterator) {
		    // initialize any member here.
		    i = iterator;
	        next();   
		}
		
	    // Returns the next element in the iteration without advancing the iterator.
		public Integer peek() {
	        return temp;
		}
		 
		// hasNext() and next() should behave the same as in the Iterator interface.
		// Override them if needed.
		@Override
		public Integer next() {
		    Integer value = temp;
	        if(i.hasNext()){
	            temp = i.next();
	        }else{
	            temp = null;
	        }
	        return value;
		}
		
		@Override
		public boolean hasNext() {
		    return temp!=null;
		}
	}
}
