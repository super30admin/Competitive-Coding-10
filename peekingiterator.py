# Time Complexity : O(1)  
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach:
# I am maintaining a variable nextElement to store the next element of the iterator
# In the constructor, I initialize nextElement with the first element of the iterator if it exists
# The peek method simply returns the nextElement without advancing the iterator
# The next method returns the current nextElement and then updates it to the next element of the iterator
# The hasNext method checks if nextElement is not None to determine if there are more elements in the iterator  

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
        self.iterator = iterator
        if iterator.hasNext():
              self.nextElement = iterator.next()
        else:
            self.nextElement = None
        
        

    def peek(self):
        return self.nextElement

    def next(self):
        result = self.nextElement
        if self.iterator.hasNext():
              self.nextElement = self.iterator.next()
        else:
            self.nextElement = None
        return result

    def hasNext(self):
        print(self.nextElement)
        return self.nextElement != None 
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].