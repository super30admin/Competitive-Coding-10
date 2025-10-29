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

class PeekingIterator(object):
    # tc : O(1) for all, sc : O(1)
    # the prb with accessign the curr iterator eis as we move to the next we loose the curr element so we need to save te element so that we can peek the element
    # having a global variable nextelemnt which is basically the iterator.next, for hasnext we can check from the iterator.hasnext
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator = iterator
        self.next_element = iterator.next() if iterator.hasNext() else None # edge case if there are no other elemenst and we want to access the next element we will simply return none 

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.next_element # at peek we just return the element and ntg else to do 

    def next(self):
        """
        :rtype: int
        """
        # at next since we also need to move our pointer lest first save our element 
        curr = self.next_element
        self.next_element = self.iterator.next() if self.iterator.hasNext() else None  # now lets move our pointer and before moving save the elemnt for future cases 
        return curr # return the element

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.next_element != None # if we don't have any nextelement that means we are at the end

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].