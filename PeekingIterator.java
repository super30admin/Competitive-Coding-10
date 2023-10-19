//Time complexity is O(1)
//Space complexity is O(1)
class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> iter;
    private Integer next = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        if (iterator.hasNext()) {
            next = iterator.next();
        }
        iter = iterator;
    }

    public Integer peek() {
        return next;
    }

    @Override
    public Integer next() {
        if (next == null) {
            return -1;
        }
        Integer toReturn = next;
        next = null;
        if (iter.hasNext()) {
            next = iter.next();
        }
        return toReturn;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}