# Time:- O(1)
# Space:- O(1)
# Approach:- if we dont have a peek value and hasnext returns false there is nothing to peek at so peek() will not return anything. If we call next and the peekvalue is not set we call the next function of the interface and return that else we have already set the peek value 
# before so we return that. On calling hasnext we check if we have already set the peek value
# or we call the interface's hasnext if both of them return false we dont have anything so we 
# return false
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
        self.iterator=iterator
        self.peekvalue=None
        
    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if self.peekvalue is not None:
            return self.peekvalue
        if self.iterator.hasNext():
            self.peekvalue=self.iterator.next()
            return self.peekvalue

    def next(self):
        """
        :rtype: int
        """
        if self.peekvalue is None:
            return self.iterator.next()
        else:
            tmp=self.peekvalue
            self.peekvalue=None
            return tmp
        

    def hasNext(self):
        """
        :rtype: bool
        """
        if self.peekvalue is None and self.iterator.hasNext()==False:
            return False
        return True
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].