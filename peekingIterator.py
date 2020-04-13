'''
Time Complexity: O(1) for all operation
Space Complexity: O(1) for all operation
Did this code successfully run on Leetcode : Yes
Explanation:   Cache the next element always is a pointer call is_next and initially set the next element in the iterator to it.
For next(): check if is_next is not None if true return is_next, after return is_next check if there are more elements if true
assign is_next to it else assign is_next to None
For Peek():  Just return the pointer
For hasNext(): Just check if pointer is None, if True we have seen all elements
'''

# Below is the interface for Iterator, which is already defined for you.
#
# class Iterator:
#     def __init__(self, nums):
#         """
#         Initializes an iterator object to the beginning of a list.
#         :type nums: List[int]
#         """
#
#     def hasNext(self):
#         """
#         Returns true if the iteration has more elements.
#         :rtype: bool
#         """
#
#     def next(self):
#         """
#         Returns the next element in the iteration.
#         :rtype: int
#         """

class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator = iterator
        self.is_next = iterator.next()

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.is_next

    def next(self):
        """
        :rtype: int
        """
        if self.is_next is not None:
            val = self.is_next
            if self.iterator.hasNext():
                self.is_next = self.iterator.next()
            else:
                self.is_next = None
            return val
        else:
            return None

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.is_next is not None

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].