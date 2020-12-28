# Time Complexity: O(1) for all operations
# Space Complexity: O(1)

# Below is the interface for Iterator, which is already defined for you.
#
# class Iterator(object):
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

class PeekingIterator(object):
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        # Cache the value of next in the constructor
        self._next = iterator.next()
        self._it = iterator
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        # Simply return the cached value
        return self._next

    def next(self):
        """
        :rtype: int
        """
        # Save the cached value in a temporary variable (this will be returned) and reset if
        temp = self._next
        self._next = None
        # If the iterator has next, advance it and cache the next value
        if self._it.hasNext():
            self._next = self._it.next()
        # Return the currently cached value
        return temp

    def hasNext(self):
        """
        :rtype: bool
        """
        return self._next is not None
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].