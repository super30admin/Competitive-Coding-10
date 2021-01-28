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
#O(1) both
class PeekingIterator(object):
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.temp = None
        self.it = iterator

    def peek(self):
        #it essentially peek() at the element that will be returned by the next call to next().
        #peek gives you the top value but doesnt proceed next pointer of iterator 
        if not self.temp: self.temp = self.it.next()
        return self.temp

    def next(self):
        #gives next value of iterator and actually proceeds pointer in iterator
        if self.temp:
            res = self.temp
            self.temp = None
            return res
        else:
            return self.it.next()
        
    def hasNext(self):
        return self.it.hasNext() or self.temp != None

    

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].