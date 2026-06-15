// Time Complexity : O(1) for peek(), next() and hasNext() methods, as we are only performing a constant number of operations in each method.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//  Brute Force Approach : We can use an additional variable to store the next element in the iterator. The peek() method will return this variable, while the next() method will return the current next element and update it to the next element in the iterator. The hasNext() method will check if there is a next element available by checking if the next element variable is not null.
//Your code here along with comments explaining your approach
// The PeekingIterator class implements the Iterator interface and provides an additional peek() method that allows us to look at the next element without advancing the iterator. We maintain a reference to the next element in the iterator, which is updated whenever we call next(). The hasNext() method checks if there is a next element available by checking if the nextElement variable is not null.
// The constructor initializes the iterator and sets the nextElement to the first element of the iterator if it exists. The peek() method simply returns the nextElement without advancing the iterator. The next() method returns the current nextElement and then updates it to the next element in the iterator, or null if there are no more elements. The hasNext() method checks if there is a next element by checking if nextElement is not null.  
// Your PeekingIterator object will be instantiated and called as such:
// PeekingIterator obj = new PeekingIterator(iter);
// Integer param_1 = obj.peek();    
// Boolean param_2 = obj.hasNext();
// Time Complexity : O(1) for peek(), next() and hasNext() methods, as we are only performing a constant number of operations in each method.

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer nextElement;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;

        if (iterator.hasNext()) {
            nextElement = iterator.next();
        }
    }

    public Integer peek() {
        return nextElement;
    }

    @Override
    public Integer next() {

        Integer result = nextElement;

        nextElement = iterator.hasNext()
                ? iterator.next()
                : null;

        return result;
    }

    @Override
    public boolean hasNext() {
        return nextElement != null;
    }
}