""""// Time Complexity : O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
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
        self.iter = iterator
        if self.iter.hasNext():
            self.curr = self.iter.next()

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
        temp = self.curr

        if self.iter.hasNext():
            self.curr = self.iter.next()
        else:
            self.curr = None

        return temp

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.curr != None

    # Your PeekingIterator object will be instantiated and called as such:
    # iter = PeekingIterator(Iterator(nums))
    # while iter.hasNext():
    #     val = iter.peek()   # Get the next element but not advance the iterator.
    #     iter.next()         # Should return the same value as [val].