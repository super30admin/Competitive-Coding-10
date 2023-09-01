'''
Problem: Peeking Iterator
Time Complexity: O(1)
Space Complexity: O(1)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        saving the peek value in self.val variable
        checking this value in next() and hasNext() method   
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
        self.val = None
        self.iterator = iterator
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if self.val is None:
            if self.iterator.hasNext():
                self.val = self.iterator.next()

        return self.val
        

    def next(self):
        """
        :rtype: int
        """
        if self.val is not None:
            value = self.val
            self.val = None
            return value
        
        if self.iterator.hasNext():
            return self.iterator.next()

        

    def hasNext(self):
        """
        :rtype: bool
        """
        if self.iterator.hasNext() or self.val is not None:
            return True
        
        return False
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].