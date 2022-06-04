import java.util.Iterator;
import java.util.List;

// TC : O(n) n - number of elements to iterate over
// SC : O(1)
public class PeekingIterator implements Iterator<Integer> {
    Integer current, future;
    Iterator<Integer> iterator;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        this.current = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return future == null ? current : future;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(future == null) {
            future = iterator.next();
        }else {
            current = future;
            if(iterator.hasNext()) future = iterator.next();
            else future = null;
        }
        return current;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext() || future != null;
    }

    public static void main(String[] args) {
        PeekingIterator peekingIterator = new PeekingIterator(List.of(1,2,3).iterator());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.hasNext());
    }
}
