#Time Complexity :o(1)
#Space Complexity :o(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this :no

class PeekingIterator(object):
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator=iterator
        if(self.iterator.hasNext()):
            self.var=self.iterator.next()
        else:
            self.var=None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        #Variable to store the value
        return self.var
        
    def next(self):
        """
        :rtype: int
        """
        temp=self.var
        if(self.iterator.hasNext()):
            self.var=self.iterator.next()
        else:
            self.var=None

        
        return temp
        
    def hasNext(self):
        """
        :rtype: bool
        """
        return self.var!=None
            