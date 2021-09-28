//https://leetcode.com/problems/peeking-iterator/
/*
Time: O(1)
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
class PeekingIterator implements Iterator<Integer> // Make use of the in-built Iterator class
{
    private Iterator<Integer> itr = null;
    private Integer nextVal = null; // gives the curr elem

    public PeekingIterator(Iterator<Integer> iterator) {
        itr = iterator;

        if (hasNext())
            nextVal = itr.next();

    }

    public Integer peek() {
        return nextVal;
    }

    @Override
    public Integer next() {
        Integer val = nextVal; // store nextVal

        if (itr.hasNext())
            nextVal = itr.next();// move the nextVal pointer to next value, so you can use it for peek()
        else
            nextVal = null;

        return val;
    }

    @Override
    public boolean hasNext() {
        return nextVal != null || itr.hasNext();
    }
}