"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Here, dueing constructor only we maintain cache of the next variable. This is the value that we return during
next or peek of this iterator. The only change is, during peek, we just return cache and during next,
we store cache in a variable , go to next, update the cache and return the previous variable. For hasnext, we just
check if there is any value in cache.
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
        self.iterator = iterator
        self.cache = None
        if self.iterator.hasNext():
            self.cache = self.iterator.next()

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.cache

    def next(self):
        """
        :rtype: int
        """
        prev = self.cache
        if self.iterator.hasNext():
            self.cache = self.iterator.next()
        else:
            self.cache = None
        return prev

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.cache != None

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].
