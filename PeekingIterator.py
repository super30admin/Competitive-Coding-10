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

#Time Complexity: O(1)
#Space Complexity: O(1)
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        #Declare a current variable
        self.current = None
        self.iter = iterator
        #Check if the iterator has elements
        if(self.iter.hasNext()==True):
            #If yes, then initialise current variable to next in the iterator
            self.current = self.iter.next()
    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        #If current variable is not null then then that's the peek element
        if(self.current!=None):
            return self.current

    def next(self):
        """
        :rtype: int
        """
        nextval = self.current
        #If the iterator has elements then return the next value of current variable 
        if(self.iter.hasNext()==True):
            self.current = self.iter.next()
        #If not then return Null
        else:
            self.current = None
        return nextval
    def hasNext(self):
        """
        :rtype: bool
        """
        #If current variable is not null then there are elements in the iterator, return true
        if(self.current!=None):
            return True
        #Else, return false
        else:
            return False

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].