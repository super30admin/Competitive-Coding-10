// Time Complexity : O(1)
// Space Complexity : O(1)

class Problem2 implements Iterator<Integer> {

    Iterator<Integer> itr;
    int nextVal = 0;

    public PeekingIterator(Iterator<Integer> iterator) {
        itr = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {

        if(nextVal > 0){
            return nextVal;
        }else if(itr.hasNext()){
            nextVal = itr.next();
            return nextVal;
        }else{
            return -1;
        }

    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    @Override
    public Integer next() {

        if(nextVal > 0){
            int temp =  nextVal;
            nextVal = 0;
            return temp;
        }else if(itr.hasNext()){
            return itr.next();
        }else{
            return -1;
        }

    }

    @Override
    public boolean hasNext() {
        if(itr.hasNext() || nextVal > 0){
            return true;
        }else{
            return false;
        }
    }
}