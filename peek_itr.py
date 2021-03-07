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
#   
"""
# Time complexity - O(1) 
# Space Complexity: O(1)
# Did this code successfully run on LeetCode?: Yes
# Problems faced while coding this:None
"""
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        # Define an iterator object
        self.itr = iterator
        self.curr = None
        self._hasNext = True
        # Take first value in a variable in the next function so as to just call the variable for peek function.
        self.next()

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.curr

    def next(self):
        """
        :rtype: int
        """
        current = self.curr
        if self.itr.hasNext():
            self.curr = self.itr.next()
        else:
            self._hasNext = False
            
        return current

    def hasNext(self):
        """
        :rtype: bool
        """
        return self._hasNext

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].