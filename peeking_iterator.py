# Time Complexity: O(1)
# Space Complexity: O(1)
# Ran on Leetcode: Yes

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
        self.iter = iterator
        self.top = None
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if not self.top:
            self.top = self.iter.next()
        return self.top
        
        
        

    def next(self):
        """
        :rtype: int
        """
        if self.top:
            res = self.top
            self.top = None
        else:
            res = self.iter.next()
        
        return res
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.iter.hasNext() or bool(self.top)
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].