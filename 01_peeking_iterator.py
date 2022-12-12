'''
TC: O(1) for each function
SC: O(1) for temp variable

Approach

'''


class PeekingIterator:
    def __init__(self, iterator):
        self.iterator = iterator
        if self.iterator.hasNext():
            self.next_val = self.iterator.next()
        else:
            self.next_val = None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.next_val

    def next(self):
        """
        :rtype: int
        """
        temp = self.next_val
        if self.iterator.hasNext():
            self.next_val = self.iterator.next()
        else:
            self.next_val = None
        return temp

    def hasNext(self):
        """
        :rtype: bool
        """
        if self.next_val:
            return True
        else:
            return False