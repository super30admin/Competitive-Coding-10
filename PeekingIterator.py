# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
class PeekingIterator:
    temp = None 
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.itr = iterator
        if self.itr.hasNext():
            self.temp = self.itr.next()
        
    # Time = O(1) | Space = O(1)
    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.temp

    # Time = O(1) | Space = O(1)
    def next(self):
        """
        :rtype: int
        """
        prev = self.temp 
        if self.itr.hasNext():
            self.temp = self.itr.next()
        else:
            self.temp = None 
        return prev 

    # Time = O(1) | Space = O(1)
    def hasNext(self):
        """
        :rtype: bool
        """
        if self.temp is not None :
            return True 
        else:
            return False