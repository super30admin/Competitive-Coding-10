//time complexity- O(1) for all functions
//space complexity- O(1)
import java.util.*;
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer ele;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.itr = iterator;
        ele = itr.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return ele;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int val = ele;
        if(itr.hasNext()) ele = itr.next();
        else ele = null;
        return val;
    }

    @Override
    public boolean hasNext() {
        if(ele == null) return false;
        return true;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        Iterator<Integer> iterator = list.iterator();

        PeekingIterator peekingIterator = new PeekingIterator(iterator);

        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.hasNext());

    }
}