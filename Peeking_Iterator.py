
class PeekingIterator:
    def __init__(self, iterator):
        self._iterator = iterator
        self._peeked_value = None
    
    #O(1)
    def peek(self):
        if self._peeked_value is None:
            if not self._iterator.hasNext():
                raise StopIteration()
            self._peeked_value = self._iterator.next()

        return self._peeked_value

    #O(1)
    def next(self):
        if self._peeked_value is not None:
            to_return = self._peeked_value
            self._peeked_value = None
            return to_return

        if not self._iterator.hasNext():
            raise StopIteration()

        # Otherwise, we need to return a new value.
        return self._iterator.next()
    
    #O(1)
    def hasNext(self):
        return self._peeked_value is not None or self._iterator.hasNext()