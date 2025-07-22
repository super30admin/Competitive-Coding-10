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

# class PeekingIterator:
#     current = None
#     iterator = None
#     def __init__(self, iterator):
#         self.iterator = iterator
#         if self.iterator.hasNext():
#             self.current = self.iterator.next()

#     def peek(self):
#         return self.current
        

#     def next(self):
#         old = self.current
#         if self.iterator.hasNext():
#             self.current = self.iterator.next()
#         else:
#             self.current = None
#         return old

    
#     def hasNext(self):
#         return self.current!=None 
        
class PeekingIterator:
    current = None
    iterator = None
    def __init__(self, iterator):
        self.iterator = iterator
        self.current = self.iterator.next() if self.iterator.hasNext else None

    def peek(self):
        return self.current
        

    def next(self):
        old = self.current
        self.current = self.iterator.next() if self.iterator.hasNext() else None
        return old

    
    def hasNext(self):
        return self.current!=None 