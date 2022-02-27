"""
Design an iterator that supports the peek operation on an existing iterator 
in addition to the hasNext and the next operations.

Implement the PeekingIterator class:

PeekingIterator(Iterator<int> nums) Initializes the object with the 
given integer iterator iterator.
int next() Returns the next element in the array and moves the 
pointer to the next element.
boolean hasNext() Returns true if there are still elements in the array.
int peek() Returns the next element in the array without moving the pointer.
Note: Each language may have a different implementation of the constructor and Iterator, 
but they all support the int next() and boolean hasNext() functions.
"""

# Time Complexity : peek, next, hasnext all use O(1)
# Space Complexity : O(1)
# Did this code successfully run on leetcode : Yes
# Any problem you faced while coding this : No


class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        
        self.iterator = iterator
        self.x = None
        
    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        # in order to peek, we are still getting value by performing next() operation and pointer is moving
        # But since it is peek(), we may still need this value for next() function
        # so storing the value in variable x
        # also checking iterator is not empty with hasnext() function
        
        if self.x is None:
            if self.iterator.hasNext():
                self.x = self.iterator.next()
                
        return self.x

    def next(self):
        """
        :rtype: int
        """
        
        # if iterator has no values, break
        # if iterator has values, check if x is None, which means we are at new pointer 
        # if x is not None, maens it has value and has been peeked. Hence need to return x
        # since the pointer is moving ahead due to next(), need to reset x in the end
        # store this value in new variable and return that variable while resetting x
        
        if self.x is not None: # means peek() has been performed for this pointer before
            temp = self.x
            self.x = None
            return temp
    
        return self.iterator.next()
    
    def hasNext(self):
        """
        :rtype: bool
        """
        # comparing with x and previous hasNext() value
        
        return self.x is not None or self.iterator.hasNext()
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].