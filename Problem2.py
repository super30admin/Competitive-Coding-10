#Time complexity is O(1)
#Space complexity is O(1)
#No issues faced while coding
#Code ran successfully on leetcode

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
    #Initializing all the required variables
    current=None
    iterator=None
    def __init__(self, iterator):
        self.iterator=iterator
        #Initially we are calling next function and we are storing the value in the current
        if(self.iterator.hasNext()):
            self.current=self.iterator.next()

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        #We will be returning the current value
        return self.current

    def next(self):
        """
        :rtype: int
        """
        #We will be storing the current value in the old 
        old=self.current
        if(self.iterator.hasNext()):
            #We will be updating the current value
            self.current=self.iterator.next()
        else:
            self.current=None
        #We will return the old value
        return old        
        

    def hasNext(self):
        """
        :rtype: bool
        """
        #Returning boolean value based on current value
        return self.current!=None

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].