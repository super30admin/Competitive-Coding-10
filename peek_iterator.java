// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class peekIterator implements Iterator<Integer> {

    Iterator<Integer> itr;
    int nextVal = 0;

    public PeekingIterator(Iterator<Integer> iterator) {
        itr = iterator;
    }

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