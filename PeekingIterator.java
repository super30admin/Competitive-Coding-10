// Iterator + Temporary storage variable
// Time complexity: O(1)
// Space complexity: O(1)
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
/*Approach:
1) In the peeking iterator we implement the already overriden methods of the iterator Interface
2) Here we plan to iterate on the itertor checking for the null elements or if the iterator is empty.
3) we use a iterator and a temp variable 
4) Idea is: for very first time we use the peek function and fetch the value and capture it in a variable 
5) This will help us get the value and also not call the next function again
-> public Integer peek() {
        if (!hasNext()) return null;
        if (temp == null) {
            temp = iterator.next();
        }
        return temp;
        }
6) for the next function()
-> we first check for null values
-> if yes the we call iterator.next and get the value
   if (!hasNext()) return null;
        if (temp == null) {
            Integer next = iterator.next();
            return next;
-> if not we assign the next varibale, value present in temp and then return the next value
        else {
            Integer next = temp;
            temp = null;
                return next;
        }
7) for hasNext() function 
        public boolean hasNext() {
                return temp != null || iterator.hasNext();
            }
*/


import java.util.*;

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer temp;

        public PeekingIterator(Iterator<Integer> iterator) {
            this.iterator = iterator;
        }
        
    // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
        if (!hasNext()) return null;
        if (temp == null) {
            temp = iterator.next();
        }
        return temp;
        }
        
        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
        if (!hasNext()) return null;
        if (temp == null) {
            Integer next = iterator.next();
            return next;
        } else {
            Integer next = temp;
            temp = null;
                return next;
        }
        }
        
        @Override
        public boolean hasNext() {
            return temp != null || iterator.hasNext();
        }
}