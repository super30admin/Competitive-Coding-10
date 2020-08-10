# Time Complexity : O(n)[n = length of nums list]
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Problem Approach
# 1. Use an instance variable to hold the peek value
# 2. In the custrictor, Move to the next element of the iterator and save value returned in the instance variable temp
# 3. For peek opeartion just return the value of the temp
# 4. For next opeartion, move the iterator if it hasNext, return the value in temp and also update the value of temp instance variable
# 5. The instance variable temp is set to null when we hit the last value. 
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator = iterator
        self.temp = iterator.next()
        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.temp
        

    def next(self):
        """
        :rtype: int
        """
        curr = self.temp
        if  self.iterator.hasNext():
            self.temp =   self.iterator.next()
        else: # the last value has been reached
            self.temp = None # this ensures that the hasNext returns False after this point
        return curr

    def hasNext(self):
        """
        :rtype: bool
        """
        return False if not self.temp else True
