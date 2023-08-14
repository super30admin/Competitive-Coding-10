// Time Complexity : O(1)
//Space Complexity : O(1)

class PeekingIterator implements Iterator<Integer> {
    private Integer next = null;
    private Iterator<Integer> itr = null;

    public PeekingIterator(Iterator<Integer> iterator) {

        this.itr = iterator;
        next();

    }

    public Integer peek() {
        return next;
    }

    @Override
    public Integer next() {
        Integer returnvalue = next;
        next = null;
        if (itr != null && itr.hasNext()) {
            next = itr.next();
        }
        return returnvalue;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}