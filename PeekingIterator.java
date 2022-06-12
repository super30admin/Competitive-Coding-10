// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {

    //Time Complexity: 0(1)
    //Space complexity: 0(1)
    //Did it successfully run on leetcode: Yes
    //Did you face any problem while coding: No

    //In brief explain your appraoch


    Iterator<Integer> itr;  //I am making the iterator as global as all the functions will need to access it
    Integer curr;   //a variable to store the value of the current
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.itr = iterator;
        curr = itr.next();  //next is pointing to the 1st element in the beginning


    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return curr;    //returning current as it is pointing to the next element

    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer i = curr;   //storing the value of current as we will have to return it and it will be changed later
        if(itr.hasNext()){  //checking if iterator has next element or not
            curr = itr.next();  //if it does, then moveing my current to next
        }
        else{
            curr = null;    //if it does not, then current will be pointing to null
        }
        return i;   //returning i as current's value has been changed
    }

    @Override
    public boolean hasNext() {
        return curr!=null;  //returning true if the iterator has next element or false if it does not

    }
}