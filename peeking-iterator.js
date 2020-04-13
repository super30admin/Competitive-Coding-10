// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * // This is the Iterator's API interface.
 * // You should not implement it, or speculate about its implementation.
 * function Iterator() {
 *    @ return {number}
 *    this.next = function() { // return the next number of the iterator
 *       ...
 *    }; 
 *
 *    @return {boolean}
 *    this.hasNext = function() { // return true if it still has numbers
 *       ...
 *    };
 * };
 */

/**
 * @param {Iterator} iterator
 */
class PeekingIterator {
    iterator;
    peekedVal;
    constructor(iterator) {
        this.iterator = iterator;
        this.peekedVal = null;
    }
    
    peek() {
        if (this.peekedVal) return this.peekedVal;
        else {
            this.peekedVal = this.iterator.next();
            return this.peekedVal;
        }
    }
    
    next() {
        if (this.peekedVal) {
            const peeked = this.peekedVal;
            this.peekedVal = null;
            return peeked;
        }
        else return this.iterator.next();
    }
    
    hasNext() {
        if (this.peekedVal) return true;
        else return this.iterator.hasNext();
    }
    
}

/** 
 * Your PeekingIterator object will be instantiated and called as such:
 * var obj = new PeekingIterator(arr)
 * var param_1 = obj.peek()
 * var param_2 = obj.next()
 * var param_3 = obj.hasNext()
 */
