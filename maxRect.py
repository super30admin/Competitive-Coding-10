#As taught in class, using stack to find the largest rectangle
#Time Complexity: O(n)
#Space complexity: O(n)
li = list()
maxi = 0
li.append(0)
for i in range(1,len(heights)):
    if heights[i] >= heights[li[-1]]:
        li.append(i)
    else:
        while (len(li)!=0 and heights[i]<heights[li[-1]]):
            temp = heights[li.pop()]
            if(len(li)==0):
                maxi = max(maxi,temp*i)
            else:
                maxi = max(maxi,temp*(i-li[-1]-1))
        li.append(i)
if (len(li)!=0):
    i = len(heights)
    while (len(li)!=0):
            temp = heights[li.pop()]
            if(len(li)==0):
                maxi = max(maxi,temp*i)
            else:
                maxi = max(maxi,temp*(i-li[-1]-1))
print(maxi)