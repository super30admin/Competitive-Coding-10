# TC==>O(1)
# SC==>O(1)
class PeekingIterator:
    def __init__(self, iterator):
#         without storing all inlist ---using these fucnction from itearto class
        self.i=iterator
        # store pekked or not 
        self.peeked=False
#         store cache thepeeked variale
        self.tmp=None
    
    
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if not self.peeked:
            self.peeked=True
            self.tmp=self.i.next()
            return self.tmp
        else:
            return self.tmp
        

    def next(self):
        """
        :rtype: int
        """
#         if we have peeked
        if self.peeked:
            self.peeked=False
            return self.tmp
#         if we have not peeked
        else:
            return self.i.next()
        
        
        

    def hasNext(self):
        """
        :rtype: bool
        """
        if self.peeked or self.i.hasNext():
            return True
        else:
            return False
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].