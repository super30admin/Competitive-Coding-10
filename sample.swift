// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

    func maxProfit(_ prices: [Int]) -> Int {
        if prices.count == 1 {
            return 0
        }
        var profit = 0
        var msp = prices[0]
        for i in 1..<prices.count {
            msp = min(msp,prices[i])
            if msp < prices[i] {
                profit += prices[i] - msp
                msp = prices[i]
            }
        }
        return profit
    }