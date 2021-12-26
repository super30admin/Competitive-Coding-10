# 284. Peeking Iterator
# https://leetcode.com/problems/peeking-iterator/

# Logic: For peeking, we will always store the latest value in a variable. 
# When peek is called we return this variable. When next is called we will 
# return peek and advance peak if there is a next number possible.

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
        self.itr = iterator
        self._next = self.itr.next()
        

    def peek(self):
        # Time Complexity: O(1)
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self._next
        

    def next(self):
        # Time Complexity: O(1)
        """
        :rtype: int
        """
        res = self._next
        self._next = None
        
        if self.itr.hasNext():
            self._next = self.itr.next()
        return res
        

    def hasNext(self):
        # Time Complexity: O(1)
        """
        :rtype: bool
        """
        return self._next is not None
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].