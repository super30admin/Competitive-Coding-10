# Time complexity - O(1)
#  Space complexity - O(1)
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator=iterator
        self.curr=self.iterator.next() if self.iterator.hasNext() else None
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.curr
        

    def next(self):
        """
        :rtype: int
        """
        val=self.curr
        self.curr=self.iterator.next() if self.iterator.hasNext() else None
        return val
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.curr!=None
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].