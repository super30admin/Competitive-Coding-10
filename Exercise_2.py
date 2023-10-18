# 402. Remove K Digits https://leetcode.com/problems/remove-k-digits/description/
# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution:
    def removeKdigits(self, num, k):
        # using stack
        num_stack = []
        for digit in num:
            while k and num_stack and num_stack[-1] > digit:
                num_stack.pop()
                k -= 1
            num_stack.append(digit)
        final_stack = num_stack[:-k] if k else num_stack
        return "".join(final_stack)


num = "1432219"
k = 3
sol = Solution()
print(sol.removeKdigits(num, k))
