
"""
https://leetcode.com/problems/peeking-iterator/
TC :O(1)
SC: O(1)
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
        self.it = iterator
        self.peek_value = None
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if self.peek_value is None:
            if not self.it.hasNext():
                return -1
            
            self.peek_value = self.it.next()
                
        return self.peek_value
        

    def next(self):
        """
        :rtype: int
        """
        if self.peek_value:
            num = self.peek_value
            self.peek_value = None
            return num
        return self.it.next()
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return  self.peek_value is not None or self.it.hasNext()
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].