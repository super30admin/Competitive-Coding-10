#Time Complexity : O(1)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class PeekingIterator(object):
    def __init__(self, iterator):
        self.iter = iterator
        self.temp = self.iter.next() if self.iter.hasNext() else None #maintain a next always

    def peek(self):
        return self.temp

    def next(self):
        ret = self.temp
        self.temp = self.iter.next() if self.iter.hasNext() else None
        return ret

    def hasNext(self):
        return self.temp is not None
