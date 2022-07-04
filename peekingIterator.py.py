'''
Time Complexity: 0(1)
Space Complexity: 0(1)
Run on LeetCode: Yes
Funda : Just maintain a cache if you call peek() method!
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
        self.__iter = iterator
        self.__cache = None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if self.__cache == None:
            # call the next() of iter
            self.__cache = self.__iter.next()
        
        return self.__cache

    def next(self):
        """
        :rtype: int
        """
        if self.__cache == None:
            return self.__iter.next()
        else:
            rtrValue = self.__cache
            self.__cache = None
            return rtrValue
        
    def hasNext(self):
        """
        :rtype: bool
        """
        if self.__cache == None:
            return self.__iter.hasNext()
        return True

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].