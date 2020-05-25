
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

/**
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
class PeekingIterator implements Iterator<Integer> {

    Iterator<Integer> iterator;
    Integer next;
    boolean endOfIterator;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        nextIterate();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(endOfIterator){
            return -1;
        }
        Integer temp = next;
        nextIterate();
        return temp;
    }

    @Override
    public boolean hasNext() {
        return !endOfIterator;
    }

    private void nextIterate(){
        if(iterator.hasNext()){
            next = iterator.next();
            endOfIterator = false;
        }else{
            endOfIterator = true;
        }
    }

}
