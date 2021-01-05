// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
set res, i to 0, j to 1
while i<len(stocks)-1
if stocks[i] >= stocks[j] increment i, j
else if in range and stocks[i] < stocks[j] && stocks[j] >= stocks[j+1] (if we encounter a dip then sell)
set res += stocks[j] - stocks[i], i = j + 1, j = i + 1
else if in range and stocks[i] < stocks[j] && stocks[j] < stocks[j+1] increment j
else if j == len(stock)-1 res += stocks[j] - stocks[i], i = j + 1, j = i + 1
return res
*/
package main

import "fmt"

func maxProfit(stocks []int) int {
	if len(stocks) <= 1 {
		return 0
	}
	res := 0
	i := 0
	j := 1
	for i < len(stocks)-1 {
		if stocks[i] >= stocks[j] {
			i++
			j++
		} else if j < len(stocks)-1 && stocks[i] < stocks[j] && stocks[j] >= stocks[j+1] {
			res += stocks[j] - stocks[i]
			i = j + 1
			j = i + 1
		} else if j < len(stocks)-1 && stocks[i] < stocks[j] && stocks[j] < stocks[j+1] {
			j++
		} else if j == len(stocks)-1 {
			res += stocks[j] - stocks[i]
			i = j + 1
			j = i + 1
		}
	}
	return res
}

func MainMaxProfits() {
	fmt.Println(maxProfit([]int{7, 1, 5, 3, 6, 4})) //expected 7
}
