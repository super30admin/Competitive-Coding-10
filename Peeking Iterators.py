# TC: O(1)
# SC: O(1)
# Below is the interface for Iterator, which is already defined for you.
#
# class Iterator(object):
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

class PeekingIterator(object):
    def __init__(self, iterator):
        self.iter = iterator
        self.peeked_value = None
        

    def peek(self):
        self.peeked_value = self.next()
        return self.peeked_value
        

    def next(self):
        if self.peeked_value:
            temp = self.peeked_value
            self.peeked_value = None
            return temp
        else:
            return self.iter.next()

        
    def hasNext(self):
        if self.peeked_value:
            return True
        else:
            return self.iter.hasNext()
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].