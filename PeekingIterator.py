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

"""
Approach:

Approach is similar to normal iterator but we are using an extra variable to store the next value in the iterator first.

For example in 
[1,2,3]

current vairable will hold 1

So whenever we call peek() we return current variable
When we call next() we wont directly return next value but instead we return current and along with that update current to the next value in iterator. In this way a pointer will always be maintained ahead to return next element when asked to peek instead of moving the pointer ahead

TC: O(1)
SC: O(1)
"""
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator = iterator
        
        if self.iterator.hasNext():
            self.current = self.iterator.next()

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.current 

    def next(self):
        """
        :rtype: int
        """
        old = self.current
        if self.iterator.hasNext():
            self.current = self.iterator.next()
        else:
            self.current = None
        
        return old

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.current != None

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].