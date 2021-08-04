class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.i = iterator
        self.cur=self.i.next() if self.i.hasNext() else None
        
        
    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.cur

    def next(self):
        """
        :rtype: int
        """
        old=self.cur
        self.cur=self.it.next() if self.it.hasNext() else None
        return old
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.cur!=None
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].
