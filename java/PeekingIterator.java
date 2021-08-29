Peeking Iterator
        Design an iterator that supports the peek operation on a list in addition to the hasNext and the next operations.

        Implement the PeekingIterator class:

        PeekingIterator(int[] nums) Initializes the object with the given integer array nums.
        int next() Returns the next element in the array and moves the pointer to the next element.
        bool hasNext() Returns true if there are still elements in the array.
        int peek() Returns the next element in the array without moving the pointer.

        Example 1:

        Input
        ["PeekingIterator", "next", "peek", "next", "next", "hasNext"]
        [[[1, 2, 3]], [], [], [], [], []]
        Output
        [null, 1, 2, 2, 3, false]

        Explanation
        PeekingIterator peekingIterator = new PeekingIterator([1, 2, 3]); // [1,2,3]
        peekingIterator.next();    // return 1, the pointer moves to the next element [1,2,3].
        peekingIterator.peek();    // return 2, the pointer does not move [1,2,3].
        peekingIterator.next();    // return 2, the pointer moves to the next element [1,2,3]
        peekingIterator.next();    // return 3, the pointer moves to the next element [1,2,3]
        peekingIterator.hasNext(); // return False

        Constraints:

        1 <= nums.length <= 1000
        1 <= nums[i] <= 1000
        All the calls to next and peek are valid.
        At most 1000 calls will be made to next, hasNext, and peek.


TC: O(1) for each method
SC: O(1)

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> it;
    Integer tmp= null;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        it = iterator;
        if(it.hasNext())
            tmp = it.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return tmp;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer next = tmp;
        if(it.hasNext())
            tmp = it.next();
        else
            tmp = null;
        return next;
    }

    @Override
    public boolean hasNext() {
        return tmp!=null;
    }
}