"""
TC - O(1)
SC - O(1)
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
        self.itr = iterator
        # self.nxt = 1
        self.nxt = self.itr.next()

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        # self.nxt = 2
        # self.nxt = 3
        return self.nxt

    def next(self):
        """
        :rtype: int
        """
        if self.nxt is None:
            raise StopIteration()
        # self.nxt is not None
        # returnVal = 1
        # returnVal = 2
        returnVal = self.nxt

        # reset value
        self.nxt = None
        if self.itr.hasNext():
            # self.nxt = 2
            # self.nxt = 3
            self.nxt = self.itr.next()
        # 1
        # 2
        return returnVal

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.nxt is not None

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].