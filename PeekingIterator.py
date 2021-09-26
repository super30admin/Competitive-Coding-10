"""
Time Complexity : O(1) for all 3 methods
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
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
        self._iterator = iterator
        self.current = None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        # We store the next element in the list in a current variable if our current
        # is None and we still have the next element and return the current element.
        if self.current is None:
            if not self._iterator.hasNext():
                return
            self.current = self._iterator.next()
        return self.current

    def next(self):
        """
        :rtype: int
        """
        # If we have non empty current element we return that element and reset the 
        # current element ot null. Also if we don't have any element left we simply 
        # return. If current is null then we return next element
        if self.current is not None:
            result = self.current
            self.current = None
            return result
        if not self._iterator.hasNext():
            return
        return self._iterator.next()
        

    def hasNext(self):
        """
        :rtype: bool
        """
        # If current is not None or we still have a next element we return True
        # otherwise False
        if self.current is not None or self._iterator.hasNext():
            return True
        else:
            return False

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].