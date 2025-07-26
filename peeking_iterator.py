# Time complexity:
# __init__: O(1)
# peek: O(1)
# next: O(1)
# hasNext: O(1)
# Space complexity: O(1) 

class PeekingIterator:
    def __init__(self, iterator):
        self.iterator = iterator
        self.next_element = None
        if self.iterator.hasNext():
            self.next_element = self.iterator.next()

    def peek(self):
        return self.next_element

    def next(self):
        temp = self.next_element
        if self.iterator.hasNext():
            self.next_element = self.iterator.next()
        else:
            self.next_element = None
        return temp

    def hasNext(self):
        return self.next_element is not None
