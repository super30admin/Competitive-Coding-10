"""
time:O(N)
space:O(1)
"""

class PeekingIterator:

    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator = iterator
        self.haspeeked = False


    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if not self.haspeeked:
            self.n = self.iterator.next()
        self.haspeeked = True
        return self.n

    def next(self):
        """
        :rtype: int
        """
        if not self.haspeeked:
            return self.iterator.next()
        self.haspeeked = False
        return self.n

    def hasNext(self):
        """
        :rtype: bool
        """

        return self.haspeeked or self.iterator.hasNext()
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].