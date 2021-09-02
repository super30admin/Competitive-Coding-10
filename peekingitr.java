
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Integer temp;
    Iterator<Integer> itr;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        temp=0;
        itr=iterator;
        
    }
    
    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(temp!=0)
            return temp;
        if(itr.hasNext()){
            temp=itr.next();
            return temp;
        }
        return -1;   
    }
    
    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(temp!=0){
            Integer temp2=temp;
            temp=0;
            return temp2;
        }
        if(itr.hasNext()){
            return itr.next();
        }
        return -1;
    }
    
    @Override
    public boolean hasNext() {
        if(itr.hasNext() || temp!=0)
            return true;
        return false;
    }
}