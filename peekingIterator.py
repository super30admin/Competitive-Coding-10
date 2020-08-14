# Time Complexity & Space Complexity : mentioned for each individual function
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach

# Used a pointer to maintain position in the iterator, The pointer is used by
# hasNext and peek. The same pointer is manipulated accordingly in the next function.
class PeekingIterator(object):
    def __init__(self, iterator):
        self.iter = iterator
        self.nElem = None
        self.next()

    # TC: O(1), SC: O(1)
    def peek(self):
        if self.hasNext():
            return self.nElem
        return None

    # TC: O(1), SC:O(1)
    def next(self):
        retVal = self.nElem
        self.nElem = None
        # Advancing
        if self.iter and self.iter.hasNext():
            self.nElem = self.iter.next()
        return retVal

    # TC: O(1), SC: O(1)
    def hasNext(self):
        return self.nElem != None
