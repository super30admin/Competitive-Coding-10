# Competetive-Coding-10

//TIme Complexity = O(N)
//Space Complexity = O(1)

class Solution {
public int maxProfit(int[] prices) {
if(prices.length == 0 || prices == null) {
return 0;
}
int profit = 0;
for(int i = 0; i < prices.length - 1; i++) {
if(prices[i+1] - prices[i] > 0) {
profit += prices[i+1] - prices[i];
}
}
return profit;
}
}

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

//Time Complexity = O(1)
//Space Complexity = O(1)

class PeekingIterator implements Iterator<Integer> {
Integer pointer;
Iterator<Integer> itr;
public PeekingIterator(Iterator<Integer> iterator) {
// initialize any member here.
this.itr = iterator;
next();
}
// Returns the next element in the iteration without advancing the iterator.
public Integer peek() {
return pointer;
}
// hasNext() and next() should behave the same as in the Iterator interface.
// Override them if needed.
@Override
public Integer next() {
Integer result = pointer;
pointer = null;
if(itr != null && itr.hasNext()) {
pointer = itr.next();
}
return result;
}
@Override
public boolean hasNext() {
return pointer != null;
}
}
