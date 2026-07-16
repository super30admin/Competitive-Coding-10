"""
1. Since we don't know which half of the mountain the element is present, we use two binary searches to find if element is present on left or right.
2. First we find the peak to identify where to split the binary search. Then ascent is until peak, descent is from peak to end of mountain
3. If we did find the element on the ascent, then we return, else we go search on the descent.

TC: O(log(N))
SC: O(1)
"""

# """
# This is MountainArray's API interface.
# You should not implement it, or speculate about its implementation
# """
#class MountainArray:
#    def get(self, index: int) -> int:
#    def length(self) -> int:

class Solution:
    def findInMountainArray(self, target: int, mountain_arr: 'MountainArray') -> int:
            length = mountain_arr.length()

            l = 0
            r = length - 1

            while l<r:
                mid = l+(r-l)//2
                mid_element = mountain_arr.get(mid)
                mid_next_ele = mountain_arr.get(mid+1)
                if mid_next_ele > mid_element:
                    l = mid + 1
                elif mid_element > mid_next_ele :
                    r = mid
            peak = l 

            ans = self.binarySearch1(mountain_arr,0,peak,target)
            if ans== -1:
                ans = self.binarySearch2(mountain_arr,peak+1,length-1,target)
            return ans


    def binarySearch1(self,arr,l,r,target) -> int:
        while l<=r:
            mid = l + (r-l)//2
            mid_ele = arr.get(mid)
            if mid_ele == target:
                return mid
            elif mid_ele < target:
                l = mid + 1
            else:
                r = mid - 1
        return -1

    def binarySearch2(self,arr,l,r,target) -> int:
        while l<=r:
            mid = l + (r-l)//2
            mid_ele = arr.get(mid)
            if mid_ele == target:
                return mid
            elif mid_ele > target:
                l = mid + 1
            else:
                r = mid - 1
        return -1
        

        