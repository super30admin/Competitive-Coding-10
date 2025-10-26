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
        self.current_element = None
        if iterator.hasNext():
            self.current_element = iterator.next()
        

    def peek(self): #O(1)
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.current_element

    def next(self): # O(1)
        """
        :rtype: int
        """
        output = self.current_element 
        if self.iterator.hasNext():
            self.current_element = self.iterator.next()
        else:
            self.current_element = None

        return output        

    def hasNext(self): # O(1)
        """
        :rtype: bool
        """
        if self.current_element==None:
            return False
        else:
            return True
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].