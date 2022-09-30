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
        self.iterator = iterator
        # save the value of the next value of iterator as cache
        self.cache = self.iterator.next()
        
    # while peeking, we just return the cache value
    def peek(self):
        return self.cache
        

    def next(self):
        val = self.cache
        # update the cache with the next value if we have a next value present
        self.cache = self.iterator.next() if self.iterator.hasNext() else None
        return val

    # check if we have a next value or not which can done by checkin the cache value
    def hasNext(self):
        return self.cache != None

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].
