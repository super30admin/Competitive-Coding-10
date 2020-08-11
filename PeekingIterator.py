
---------------------------------------Peeking Iterator ------------------------------------------
# Time Complexity : O(1) as N is the length of elements we can take 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I will use the iterator, as iterator element and a next element. When we call peek element, will return next element. 
# and when we call next element, we will return next element, iterator has next element, we will return
# next element. FOr Hasnext function, we will return if self.n has next element else return False. 


class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.it = iterator
        self.n = iterator.next()
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.n
        
        

    def next(self):
        """
        :rtype: 
        """
        if self.n is None:
            raise stopIterator()
        
        to_return = self.n
        self.n = None
        if self.it.hasNext():
            self.n = self.it.next();
        return to_return
            
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return True if self.n else False
        
        
        