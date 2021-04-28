"""
TC: O(n)
SC: O(1)
"""

def profit(n):
    # Sanity check
    if n==None or len(n)==0 or len(n)==1:
        return 0

    # Initialize the variable cnt = 0
    cnt = 0
    dif = 0
    for i in range(len(n)-1):
        if(n[i+1] > n[i]):
           dif = n[i+1] - n[i]
           cnt += dif

    return cnt


n = [7,1,5,6]
#n = [1,2,3,4,5]
Prt = profit(n)
print("Profit: ",Prt)
