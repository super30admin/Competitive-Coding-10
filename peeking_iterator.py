# Approach - Cache value in advance 
# Time - O(1)
# Space - O(1)
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """

        self.cache = None # initialize to None this will be used for peek operations

        self.iterator = iterator

        if self.iterator.hasNext():
            self.cache = self.iterator.next() # assign first value to cache while starting off


    def peek(self):
        return self.cache


    def next(self): # always return value which we cached earlier and also update cache to next value if hasNext is valid, ie pointer moves to next val

        prev = self.cache

        if self.iterator.hasNext():
            self.cache = self.iterator.next()

        else:
            self.cache = None

        return prev


    def hasNext(self):

        return self.cache != None