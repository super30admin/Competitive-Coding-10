# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        bitmask = 0
        # DOing XOR on entire list. It will have two numbers in it
        for n in nums:
            bitmask ^= n

        # It will have a number where in which a bit will be 1 where there 0 in one of the number and 1 in the other number
        compmask = bitmask & (-bitmask)

        # now in order to find one of the number, we will take XOR of the numbers having 1 at the position where there is difference of the bits.
        x = 0
        for n in nums:
            if (compmask & n):
                x ^= n
                # After getting one of the number, just do XOR with the original number to get the second number
        ans = []
        ans.append(x)
        ans.append(bitmask ^ x)

        return ans