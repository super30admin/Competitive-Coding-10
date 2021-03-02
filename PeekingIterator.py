# Time Complexity : O(1)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Initialize a variable cache for storing the previous iterator value. When we call iterator.next, first we store the next iterator value and pointer is at first position
# Then if we peek we just return the cached value and dont move the pointer so the pointer is still at first position
# For .next function we need to store the cached value as old_value and return it and check if the iterator hasnext then the cached value gets updated and pointer moves to next position
# Cached value is the value at the pointer
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
        self.cached_value = self.iterator.next()

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.cached_value

    def next(self):
        """
        :rtype: int
        """
        old_value = self.cached_value
        if self.iterator.hasNext():
            self.cached_value = self.iterator.next()
        else:
            self.cached_value = None
        return old_value

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.cached_value != None


# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].