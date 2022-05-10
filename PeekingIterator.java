import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Time Complexity : O(1)
//Space Complexity : O(1)
public class PeekingIterator implements Iterator<Integer> {	
	/**Approach: Using native iterator | Time O(1) | Space O(1)**/
	Integer peak;
    Iterator<Integer> it;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    it= iterator;
        peak= it.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() { //O(1)
        return peak;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() { //O(1)
        Integer curr= peak;
        if(it.hasNext())
            peak= it.next();
        else 
            peak= null;
	    return curr;
	}
	
	@Override
	public boolean hasNext() { //O(1)
	    return (peak!=null);
	}
	
	// Driver code to test above
	public static void main (String[] args) {	
		List<Integer> list= Arrays.asList(new Integer[] {1,2,3});
		PeekingIterator peekingIterator  = new PeekingIterator(list.iterator());		
		System.out.println("calling next: "+peekingIterator.next());    // return 1, the pointer moves to the next element [1,2,3].
		System.out.println("calling peek: "+peekingIterator.peek());    // return 2, the pointer does not move [1,2,3].
		System.out.println("calling next: "+peekingIterator.next());    // return 2, the pointer moves to the next element [1,2,3]
		System.out.println("calling next: "+peekingIterator.next());    // return 3, the pointer moves to the next element [1,2,3]
		System.out.println("calling hasNext: "+peekingIterator.hasNext()); // return False
	}
}
