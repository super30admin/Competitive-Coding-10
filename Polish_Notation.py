# -*- coding: utf-8 -*-
"""
TC: O(N) as we have to traverse through the list of strings
SC: O(1) as no extra space used
"""

class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        #declare an empty stack
        st = []
        #traverse through the entire list given
        for i in tokens:
            #check if curr element is an operator
            # if not, append to stack else pop last elements and perform the operation
            if i not in "+-*/":
                st.append(int(i)) 
            else:
                first = st.pop()
                sec = st.pop()                
                if i == "/":
                    st.append(int(float(sec) / first))
                elif i == "+":
                    st.append(sec + first)
                elif i == "*":
                    st.append(sec * first)
                else:
                    st.append(sec - first)
        return st.pop()     