# Time complexity : O(n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        n = len(gas)
        
        # maintain running sum of total tank and the curr tank
        curr_tank = total_tank = 0
        # keeping track of starting index
        start = 0
        
        for i in range(n):
            # get the difference of gas and cost of that station
            total_tank += gas[i] - cost[i]
            curr_tank += gas[i] - cost[i]
            
            # if at any point, the curr tank goes less than 0, restart the tank and move the start to the next index
            if curr_tank < 0:
                start = i + 1
                curr_tank = 0
        
        # after traversing all the station, if we have total tank which is greater than 0, we have an index that can complete the circular
        if total_tank >= 0:
            return start
        else:
            # else return -1
            return -1
