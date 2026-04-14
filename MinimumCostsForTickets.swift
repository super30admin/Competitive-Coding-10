//
//  MinimumCostsForTickets.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 2/23/26.
//

class MinimumCostsForTickets {
    
    init() {
        //        let minCost = mincostTickets([1,4,6,7,8,20], [2,7,15])
        //        print("minCost \(minCost)")
        
        let minCost = mincostTicketsUsingRecursion([1,4,6,7,8,20], [2,7,15])
        print("minCost \(minCost)")
        
    }
    
    func mincostTicketsUsingRecursion(_ days: [Int], _ costs: [Int]) -> Int {
        var memo = Array(repeating: -1, count: days.count)
        return helperUsingRecursion(days, costs, passes: [1, 7, 30], pivot: days.count - 1, memo: &memo)
    }
    
    func helperUsingRecursion(_ days: [Int], _ costs: [Int], passes: [Int], pivot: Int, memo: inout [Int]) -> Int {
        //base
        if (pivot < 0) {
            return 0
        }
        if (memo[pivot] != -1) {
            return memo[pivot]
        }
        //logic
        for i in stride(from: pivot, through: 0, by: -1) {
            
            //loop through all passes. check boundary conditions,  take the cost. costs[passDay] + cost for j - 1 index in day
            //loop through the typesofpassea.
            
            for (index, passDay) in passes.enumerated() {
                //1, 7 30
                var j = i
                
                while (j >= 0 && days[i] - days[j] + 1 <= passDay) {
                    j -= 1
                }
                var costForPassDay = costs[index]
                if (j >= 0) {
                    costForPassDay = costs[index] + helperUsingRecursion(days, costs, passes: passes, pivot: j, memo: &memo)
                }
                if (memo[i] < 0) {
                    memo[i] = costForPassDay
                } else {
                    memo[i] = min(memo[i], costForPassDay)
                }
            }
        }
        return memo[pivot]
    }
    
    
    
    //MARK: Tabulation
    func mincostTickets(_ days: [Int], _ costs: [Int]) -> Int {
        
        return helper(days, costs, passes: [1, 7, 30])
    }
    
    func helper(_ days: [Int], _ costs: [Int], passes: [Int]) -> Int {
        
        var dp = Array(repeating: 0, count: days.count)
        var minPass = Int.max
        for cost in costs {
            minPass = min(minPass, cost)
        }
        dp[0] = minPass
        for i in 1..<days.count {
            //days ...
            var minCost = Int.max
            for (index, passDay) in passes.enumerated() {
                var j = i
                while (j >= 0 && days[i] - days[j] + 1 <= passDay) {
                    j -= 1
                }
                
                var costForThisPass = costs[index]
                if (j >= 0) {
                    costForThisPass = costForThisPass + dp[j]
                }
                minCost = min(minCost, costForThisPass)
            }
            
            dp[i] = minCost
        }
        return dp[days.count - 1]
    }
}
