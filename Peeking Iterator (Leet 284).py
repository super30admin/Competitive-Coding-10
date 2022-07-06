'''
Time: O(1)
Space: O(1)
'''

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
        self.temp = None
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if self.temp is None:
            self.temp = self.itr.next()
            return self.temp
        else:
            return self.temp
        

    def next(self):
        """
        :rtype: int
        """
        if self.temp is not None:
            tt = self.temp
            self.temp = None
            return tt
        else:
            return self.itr.next()
        

    def hasNext(self):
        """
        :rtype: bool
        """
        if self.temp is None:
            return self.itr.hasNext()
        else:
            return True
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].