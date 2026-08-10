#Problem2: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
# Time Complexity: O(1) for peek(), next() and hasNext(), since each just reads or updates a stored value
# Space Complexity: O(1), we only store one extra value ahead of time, not the whole list
# Approach:
# We keep one element pre fetched in self.nextnumber at all times
# peek() just returns this stored value without touching the iterator
# next() returns the stored value, then pulls the next one from the iterator to refill it
# hasNext() checks if there is a stored value left, since it becomes None when the iterator runs out

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
        # keep a reference to the raw iterator so we can pull more values later
        self.nextnumber = self.iterator.next()
        # pre fetch the first value right away, this is our one ahead buffer

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.nextnumber
        # just return the stored value, nothing moves since we are only reading

    def next(self):
        """
        :rtype: int
        """
        temp = self.nextnumber
        # save the current stored value, this is what we will return

        self.nextnumber = None
        # clear it for now, we are about to check if there is more to pull

        if self.iterator.hasNext():
            # check the raw iterator, not our own hasNext, since our own nextnumber was just cleared
            self.nextnumber = self.iterator.next()
            # refill the buffer with the next value from the raw iterator

        return temp
        # return the value that was cached before this call started

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.nextnumber is not None
        # if nextnumber is still holding a value, there is more left to give

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].