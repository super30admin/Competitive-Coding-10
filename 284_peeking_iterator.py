"""
Leetcode: https://leetcode.com/problems/peeking-iterator/

Approach: Saving Peeked Value
Time Complexity: All methods: O(1).
Space Complexity: All methods: O(1).
"""


class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self._iterator = iterator
        self._peeked_value = None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if not self._peeked_value:
            if not self._iterator.hasNext():
                raise StopIteration()
            self._peeked_value = self._iterator.next()
        return self._peeked_value

    def next(self):
        """
        :rtype: int
        """
        if self._peeked_value:
            to_return = self._peeked_value
            self._peeked_value = None
            return to_return

        if not self._iterator.hasNext():
            raise StopIteration()

        return self._iterator.next()

    def hasNext(self):
        """
        :rtype: bool
        """
        return self._peeked_value or self._iterator.hasNext()

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].