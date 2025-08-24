class Iterator:
        ''' Implements the default Iterator class for a list of ints'''
        def __init__(self, nums):
            self.nums = nums
            self.index = 0

        def hasNext(self):
            return self.index < len(self.nums)

        def next(self):
            val = self.nums[self.index]
            self.index += 1
            return val

class PeekingIterator:
    '''
    284 Peeking Iterator
    https://leetcode.com/problems/peeking-iterator/description/

    Solution:
    1. The key idea is to be one step ahead of the default Iterator(). This is evident from the constructor of PeekingIterator() where we call the Iterator object, fetch the next element and save it in an auxiliary variable "curr" even though the user of PeekingIterator() has not requested the next element. Whenever, the user requests the next element from the PeekingIterator(), we not only return the value of "curr" but also fetch the next element from the Iterator object and update "curr" with the newly fetched element so that we are ready for a future call to PeekingIterator.next().
    Time: O(1), Space: O(1)
    '''
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iter = iterator
        self.hN = self.iter.hasNext()
        if self.hN:
            self.curr = self.iter.next()
        else:
            self.curr = None


    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.curr


    def next(self):
        """
        :rtype: int
        """
        val = self.curr
        self.hN = self.iter.hasNext()
        if self.hN:
            self.curr = self.iter.next()
        else:
            self.curr = None
        return val


    def hasNext(self):
        """
        :rtype: bool
        """
        return self.hN


def run_PeekingIterator():
    tests = [ (["PeekingIterator","next","peek","next","next","hasNext"],
               [1,2,3],
               [None, 1,2,2,3, False]),
              (["PeekingIterator","hasNext","peek","peek","next","next","peek","peek","next","hasNext","peek","hasNext","next","hasNext","peek"],
               [1,2,3,4],
               [None,True,1,1,1,2,3,3,3,True,4,True,4,False,None],
               ),
    ]
    for test in tests:
        operations, nums, ans = test[0], test[1], test[2]
        result = []
        for operation in operations:
            if operation == "PeekingIterator":
                peekingIterator = PeekingIterator(Iterator(nums))
                x = None
            elif operation == "hasNext":
                x=peekingIterator.hasNext(); #print(f"hasNext = {x}")
            elif operation == "peek":
                x=peekingIterator.peek(); #print(f"peek = {x}")
            else:
                x=peekingIterator.next(); #print(f"next = {x}")
            result.append(x)
        print(f"\nOperations = {operations}")
        print(f"nums = {nums}")
        print(f"result = {result}")
        success = (ans==result)
        print(f"Pass: {success}")
        if not success:
            print("Failed")
            return

run_PeekingIterator()