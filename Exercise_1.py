# 150. Evaluate Reverse Polish Notation (https://leetcode.com/problems/evaluate-reverse-polish-notation/description/)
# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

class Solution:
    def evalRPN(self, tokens):
        stack = []
        for i in range(len(tokens)):
            if tokens[i] == '+':
                top_elemt_1 = stack.pop()
                top_elemt_2 = stack.pop()
                result = top_elemt_1 + top_elemt_2
                stack.append(result)
            elif tokens[i] == '-':
                top_elemt_1 = stack.pop()
                top_elemt_2 = stack.pop()
                result = top_elemt_2 - top_elemt_1
                stack.append(result)
            elif tokens[i] == '*':
                top_elemt_1 = stack.pop()
                top_elemt_2 = stack.pop()
                result = top_elemt_2 * top_elemt_1
                stack.append(result)
            elif tokens[i] == '/':
                top_elemt_1 = stack.pop()
                top_elemt_2 = stack.pop()
                result = int(top_elemt_2 / top_elemt_1)
                stack.append(result)
            else:
                stack.append(int(tokens[i]))
        return stack[-1]


sol = Solution()
print(sol.evalRPN(["2", "1", "+", "3", "*"]))
