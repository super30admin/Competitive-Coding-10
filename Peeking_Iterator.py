# Created by Aashish Adhikari at 6:46 PM 3/1/2021

# Below is the interface for Iterator, which is already defined for you.
#
# class Iterator(object):
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


'''
Time Complexity:
peek(): O(1)
next(): O(1)
hasNext(): O(1)

Space Complexity:
peek(): O(1)
next(): O(1)
hasNext(): O(1)

'''

class PeekingIterator(object):
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """

        from collections import deque
        self.stack = deque()

        self.native_iterator = iterator

        if self.native_iterator.hasNext():

            self.stack.append(self.native_iterator.next())



    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        if len(self.stack) == 0:
            return -1
        else:
            return self.stack[0]


    def next(self):
        """
        :rtype: int
        """
        if self.native_iterator.hasNext():
            self.stack.append(self.native_iterator.next())
        return self.stack.popleft()

    def hasNext(self):
        """
        :rtype: bool
        """
        if len(self.stack) == 0:
            return False
        return True


# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].