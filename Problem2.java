//Time complexity : O(1)
//Space complexity : O(1)

class Problem2 implements Iterator<Integer> {
    Iterator<Integer> iterator;
    int nxt;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        this.nxt = -1;

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {

        if(nxt!=-1){
            return nxt;
        }
        nxt = iterator.next();
        return nxt;

    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(nxt!=-1){
            int temp = nxt;
            nxt = -1;
            return temp;
        }
        else{
            return iterator.next();
        }

    }

    @Override
    public boolean hasNext() {
        if(nxt!=-1) return true;
        return iterator.hasNext();

    }
}