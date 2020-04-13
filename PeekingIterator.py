'''
Solution:
1.  The main idea of this is to peek the next element without advancing to the next element in 
    the iterable object.
2.  So, for that we call next() method beforehanded and store it so that when we call peek(),
    we can retrieve what the correct element would be.

Time Complexity:    O(N) to traverse entire iterable object and O(1) to access next(), peek() and hasNext()
Space Complexity:   O(1)

--- Passed all testcases successfully on leetcode.
'''


# Below is the interface for Iterator, which is already defined for you.

class Iterator:
    def __init__(self, nums):
        """
        Initializes an iterator object to the beginning of a list.
        :type nums: List[int]
        """

    def hasNext(self):
        """
        Returns true if the iteration has more elements.
        :rtype: bool
        """

    def next(self):
        """
        Returns the next element in the iteration.
        :rtype: int
        """

class PeekingIterator:
    
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """

        #   initialize current to null if in case no element exists
        self.current = None
        self.iter = iterator

        #   if has elements => save the next element in current attribute
        if (self.iter.hasNext()):
            self.current = self.iter.next()

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """

        #   just return the next element without calling next() by storing in another attribute
        return self.current

    def next(self):
        """
        :rtype: int
        """

        #   store the value to be returned before calling next()
        nextValue = self.current
        
        #   call next() if it has elements remaining
        if (self.iter.hasNext()):
            self.current = self.iter.next()
        else:
            self.current = None
        
        #   return the stored value
        return nextValue

    def hasNext(self):
        """
        :rtype: bool
        """

        #   if current attribute is not None => it has elements
        #   don't use hasNext() directly as you call next() method beforehanded
        return (self.current != None)

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].