# Time Complexity : O(1)
# Space Complexity :O(1)
# Passed on Leetcode: yes

class PeekingIterator:
    def __init__(self, iterator):
        self.iterator = iterator
        self.next_element = None
        self._advance_iterator()

    def _advance_iterator(self):
        if self.iterator.hasNext():
            self.next_element = self.iterator.next()
        else:
            self.next_element = None

    def peek(self):
        return self.next_element

    def next(self):
        if self.hasNext():
            result = self.next_element
            self._advance_iterator()
            return result

    def hasNext(self):
        return self.next_element is not None
