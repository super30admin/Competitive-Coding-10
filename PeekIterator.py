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



#All TC passed on leetcode

class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        #Here we assign the iterator to peek iterator 
        #We store next's value in buffer so that it can be returned when peeked
        self.iterator = iterator
        self.buffer = None
        if self.iterator.hasNext():
            self.buffer = self.iterator.next()
        

    #Here we return the value stored in buffer
    #Time complexity - O(1)
    #Space complexity - O(1)
    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.buffer
        

    #Here we return the value stored in buffer and then update buffer to store iterator's next() value
    #Time complexity - O(1)
    #Space complexity - O(1)
    def next(self):
        """
        :rtype: int
        """
        val = self.buffer
        if self.iterator.hasNext():
            self.buffer = self.iterator.next()
        else:
            self.buffer = None
        return val
        

    #Here we return True if buffer value is not holding Null.
    #Time complexity - O(1)
    #Space complexity - O(1)
    def hasNext(self):
        """
        :rtype: bool
        """
        return self.buffer!=None
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].