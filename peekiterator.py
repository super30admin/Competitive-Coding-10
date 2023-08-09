class PeekingIterator:
    def _init_(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        # initalize iterator
        self.it = iterator
        # initialize peeked_value : it shows if the iterator has peeked or not
        self.peeked_value = None
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        # if iterator has not peeked
        if self.peeked_value is None:
            if self.it.hasNext():
                self.peeked_value = self.it.next()
            else:
                raise StopIteration()
        
        # if iterator has peeked
        return self.peeked_value
        

    def next(self):
        """
        :rtype: int
        """
        # if it has peeked
        if self.peeked_value is not None:
            ans = self.peeked_value
            self.peeked_value = None
            return ans

        # if it has not peeked
        return self.it.next()
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.peeked_value is not None or self.it.hasNext()
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].
#T.C = S.C=O(1)