# problem2.py

#https://leetcode.com/problems/peeking-iterator/description/


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
        self.tempPeak = self.iterator.next() if self.iterator.hasNext() else None

        

    def peek(self): #1
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if self.tempPeak:
            return self.tempPeak
        return -1

    def next(self): 
        """
        :rtype: int
        """
        temp = self.peek() if self.hasNext() else -1
        if temp == -1:
            return temp
        self.tempPeak = self.iterator.next() if self.iterator.hasNext() else None
        return temp

        

    def hasNext(self):
        """
        :rtype: bool
        """
        if self.peek() != -1:
            return True 
        return False
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].