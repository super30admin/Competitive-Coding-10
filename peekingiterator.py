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


# Time complexity - O(1)
# Space complexity - O(1)
# Did this solution run on leetcode? - yes
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator = iterator
        self.curr_elem = None

        
    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        # if the element which is peeked once, is not used yet by calling next.
        # so we check whether the current element is None.
        # if it's None, find the next element and return it.
        if self.curr_elem is None: 
            if self.iterator.hasNext():
                self.curr_elem = self.iterator.next()
                
        return self.curr_elem
        

    def next(self):
        """
        :rtype: int
        """
        # if the current element is not None, return it and set the curr element to None.
        # else, check fetch the next element from the iterator.
        if self.curr_elem is not None: 
            curr_elem = self.curr_elem
            self.curr_elem = None
            return curr_elem 
        
        if self.iterator.hasNext():
            return self.iterator.next()
        

    def hasNext(self):
        """
        :rtype: bool
        """
        # check whether there is a next element.
        # if the element has been peeked but not fetched. the curr_elem will not be None.
        return self.iterator.hasNext() or self.curr_elem is not None

# Solution from Leetcode
# Time complexity - O(1)
# Space complexity - O(1)
# Did this solution run on leetcode? - yes
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator = iterator
        self.curr_elem = iterator.next() if iterator.hasNext() else None # we update the curr element by default to avoid the conditions later.

        
    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        # check if the current element is not None
        if self.curr_elem is not None:     
            return self.curr_elem
        

    def next(self):
        """
        :rtype: int
        """
        if self.curr_elem is not None: 
            answer = self.curr_elem
            self.curr_elem = None
            if self.iterator.hasNext():
                self.curr_elem = self.iterator.next() # next element is already set in the curr element. This can be directly used in any of the three calls.
            return answer
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.curr_elem is not None   # return whether curr element has some value.

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].

