#Time Complexity: O(1)
#Space Complexity: O(1)

class PeekingIterator(object):

    current = None
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
        self.current = self.iterator.next() if self.iterator.hasNext() else None
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