# TimeComplexity:O(n)
# SpaceComplexity:O(1)
# Approach:if next value exists then store it in a variable while returnting next



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
        self.iter=iterator
        self.nx=self.iter.next()
        
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if self.hasNext() :return self.nx
        return None
        
        

    def next(self):
        """
        :rtype: int
        """
        num=self.nx
        if self.iter.hasNext():
            self.nx=self.iter.next()
        else:
            self.nx=None
        return num
        

        

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.nx is not None
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].
