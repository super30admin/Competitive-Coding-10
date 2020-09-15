#Problem 2:https://leetcode.com/problems/peeking-iterator/
#Test Cases passed on Leetcode 
#Time Complexity:    O(1)
#Space Complexity:   O(1)

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
        self.iter=iterator
        self.hasPeeked=False
        self.peekedElement=None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        #if peek has not been called
        if not self.hasPeeked:
            self.peekedElement=self.iter.next()
            self.hasPeeked=True
        return self.peekedElement
        

    def next(self):
        """
        :rtype: int
        """
        if not self.hasPeeked:
            return self.iter.next()
        else:
            self.hasPeeked=False
            return self.peekedElement
        

    def hasNext(self):
        """
        :rtype: bool
        """
        if self.hasPeeked or self.iter.hasNext():
            return True
        return False

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].