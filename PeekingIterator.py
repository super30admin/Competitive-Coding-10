# TC: O(1) for all the operations.
# SC: O(1) for all operations.

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
        if self.iterator.hasNext():
            self.curr = self.iterator.next()        

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
        old_cache = self.curr
        self.curr =  self.iterator.next() if self.iterator.hasNext() else None
        return old_cache

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.curr != None
