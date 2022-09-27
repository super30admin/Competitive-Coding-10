#TC: O(1) for each operation
#SC: O(1)
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.itr = iterator
        self.nxt = None
        
        if self.itr.hasNext():
            self.nxt = self.itr.next()
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.nxt
        

    def next(self):
        """
        :rtype: int
        """
        val = self.nxt
        if self.itr.hasNext():
            self.nxt = self.itr.next()
        else:
            self.nxt = None
        return val

    def hasNext(self):
        """
        :rtype: bool
        """
        if self.nxt:
            return True
        else:
            return False
