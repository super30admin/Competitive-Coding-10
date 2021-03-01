# Time Complexity : O(1)
# Space Complexity : O(1)
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.cache = None
        self.iterator = iterator
        
        # initialize cache to store the future value. Initially this will be the very first element in array
        if self.iterator.hasNext():
            self.cache = self.iterator.next()
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.cache
        

    def next(self):
        """
        :rtype: int
        """
        # store the current element's value
        prev = self.cache
        
        if self.iterator.hasNext():
            # if there are more elements, then update cache to store next future element for peeking function
            self.cache = self.iterator.next()
        else:
            # if there is no next element, update cache value to reflect no peek possible
            self.cache = None
        
        # return current element because that it what next() function is supposed to do, return and move forward
        return prev
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.cache != None
        