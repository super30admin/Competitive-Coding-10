class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> it;
    private int num = 0;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.it = iterator;
    }

    public Integer peek() {
        if (num == 0)
            num = it.next();
        return num;
    }

    public Integer next() {
        if (num != 0) {
            int out = num;
            num = 0;
            return out;
        }
        return it.next();
    }

    public boolean hasNext() {
        return num != 0 ? true : it.hasNext();
    }
}