# Time Complexity: O(1)
# Space Complexity: O(1)

class PeekingIterator:
    def __init__(self, iterator):
        self._next = iterator.next()
        self._iterator = iterator

    def peek(self) -> int:
        return self._next

    def next(self) -> int:
        if not self._next:
            return None
        return_val = self._next
        self._next = None
        if self._iterator.hasNext():
            self._next = self._iterator.next()
        return return_val

    def hasNext(self) -> bool:
        return self._next is not None