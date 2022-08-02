import java.util.Iterator;

//Space Complexity=O(1)
public class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iterator;
    int peek;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator=iterator;
        this.peek=-1;
    }

    //Time complexity=O(1)

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(peek!=-1){
            return peek;
        }
        peek=iterator.next();
        return peek;
    }

    //Time complexity=O(1)

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(peek!=-1){
            int temp=peek;
            peek=-1;
            return temp;
        }else{
            return iterator.next();
        }
    }

    //Time complexity=O(1)
    @Override
    public boolean hasNext() {
        if(peek!=-1) return true;
        return iterator.hasNext();
    }
}
