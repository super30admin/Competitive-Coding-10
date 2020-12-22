#Simple peeking iterator implementation 
#Timee and space complexities: O(1)
class PeekingIterator:
    current = None
    iterator = None
    
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
        if self.iterator.hasNext():
            self.current = self.iterator.next()
        else:
            self.current = None
        return old
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.current!=None