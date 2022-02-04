# Time Complexity - O(1)
# Space Complexity - O(1)
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.it = iterator
        self.nextEle = self.it.next() if self.it.hasNext() else None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.nextEle

    def next(self):
        """
        :rtype: int
        """
        temp = self.nextEle
        self.nextEle = self.it.next() if self.it.hasNext() else None
        return temp

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.nextEle is not None