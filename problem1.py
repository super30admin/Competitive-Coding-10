#Peeking Iterator
# // Time Complexity : O(1)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no




class PeekingIterator:
    def __init__(self, iterator):
        self.i = iterator
        self.nextE = self.i.next() if self.i.hasNext() else None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.nextE
        

    def next(self):
        """
        :rtype: int
        """
        if (self.nextE!=None):
            temp = self.nextE
            self.nextE = self.i.next() if self.i.hasNext() else None
            return temp
        else:
            return None
        

    def hasNext(self):
        """
        :rtype: bool
        """
        if self.nextE:
            return True
        else:
            return False


