# Time Complexity : peek(), next(), hasNext() → O(1)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : We store the next element in advance during initialization.
# peek() just returns this stored value without moving the iterator.
# When next() is called, we return the stored value and fetch the next one from the iterator.

# Below is the interface for Iterator, which is already defined for you.
#
# class Iterator:
#     def __init__(self, nums):
#         """
#         Initializes an iterator object to the beginning of a list.
#         :type nums: List[int]
#         """
#
#     def hasNext(self):
#         """
#         Returns true if the iteration has more elements.
#         :rtype: bool
#         """
#
#     def next(self):
#         """
#         Returns the next element in the iteration.
#         :rtype: int
#         """

class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.it_ = iterator
        self.peek_val = None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if self.peek_val is None:
            self.peek_val = self.it_.next()
        return self.peek_val
        
    def next(self):
        """
        :rtype: int
        """
        if self.peek_val:
            to_return = self.peek_val
            self.peek_val = None
            return to_return
        
        return self.it_.next()
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.peek_val is not None or self.it_.hasNext()
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].