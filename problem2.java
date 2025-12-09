// Time Complexity :O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

/*
Approach
we are using a native iterator to implement this iterator,
you native iterator is alway one ele ahead of the peeking iterator

when the peeking iterator is initialised we store the first ele 

if peek it called we just return the value of the stored ele

if next is called, as we alreay have the next value stored in ele we return that value but 
before we return we check if there is a next ele if yes we save that

if hasnext it checks if nextEl is null or not, and returns accordingly 
*/

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iter;
    Integer nextEl;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iter = iterator;
        this.nextEl = iter.next();
    }

    public Integer peek() {
        return nextEl;
    }

    @Override
    public Integer next() {
        Integer temp = nextEl;
        nextEl = null;
        if (iter.hasNext()) {
            nextEl = iter.next();
        }
        return temp;
    }

    @Override
    public boolean hasNext() {
        if (nextEl != null) {
            return true;
        }
        return false;
    }
}