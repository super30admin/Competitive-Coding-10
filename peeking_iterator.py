class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator = iterator
        self.next_val = iterator.next() if iterator.hasNext() else None
        
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        
    def peek(self):
        return self.next_val

    def next(self):
        """
        :rtype: int
        """
        cur = self.next_val
        self.next_val = self.iterator.next() if self.iterator.hasNext() else None
        return cur

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.next_val is not None
        
   