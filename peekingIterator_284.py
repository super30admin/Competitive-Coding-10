# // Time Complexity : O(1)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# Approach:
# Peek(): If current element is None, find next element and return it. Else simply return current element
# Next(): If current element is not None, return the current elemnt and set the curr_element to None. If it is None, check if it hasNext() and return the next element.
#hasNext(): return true if currElem is not None 


class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator = iterator
        self.curr_elem = None
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if self.curr_elem is None:
            if self.iterator.hasNext():
                self.curr_elem = self.iterator.next()
        
        return self.curr_elem
        

    def next(self):
        """
        :rtype: int
        """
        if self.curr_elem is not None:
            current = self.curr_elem
            self.curr_elem = None
            return current
        
        if self.iterator.hasNext():
            return self.iterator.next()
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.iterator.hasNext() or self.curr_elem is not None
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].