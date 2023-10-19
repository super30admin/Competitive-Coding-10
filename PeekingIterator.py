"""
Rasika Sasturkar
Time Complexity: O(1), for all the operations.
Space Complexity: O(1), for all the operations.

This code ran successfully on LeetCode and passed all the test cases.
"""


class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator = iterator
        self.next_ele = self.iterator.next() if self.iterator.hasNext() else None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.next_ele

    def next(self):
        """
        :rtype: int
        """
        curr = self.next_ele
        self.next_ele = self.iterator.next() if self.iterator.hasNext() else None
        return curr

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.next_ele is not None
