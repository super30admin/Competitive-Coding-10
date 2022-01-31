class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr; //we take the inbuilt iterator with integer input and we name it as itr.
    Integer nextEl; // we take another integer variable with name nextEl;

    public peekingIterator(Iterator<Integer> iterator) {
        this.itr = iterator; // in this constructor, we take the value from the global scope to here.
        this.nextEl = itr.next(); //this is the next element from the current element that the iterator is pointing to
    }

    public Integer peek() {
        return nextEl; //this method returns the element that the iterator is currently pointing to
    }

    @Override
    public Integer next() {
        int value = nextEl; //in this method, the value of nextel is stored in an integer variable value
        if(itr.hasNext()) { // if the itr is having a next element,
            nextEl = itr.next(); //the value of nextEl will be updated from the value we get from itr.next
        }
        else { //if the itr is not having a next element
            nextEl == null; // we make the value of the nextel as null
        }
        return value // in the end, we return the value
    }
    @Override
    public boolean hasNext() {
        return nextEl != null; //we return true if the nextEl is not equal to null which means there is a next element present.
    }
}