// https://leetcode.com/problems/peeking-iterator/description/
// Time Complexity: 
// peek(): O(1)
// next(): O(1)
// hasNext(): O(1)

// Space Complexity: 
// peek(): O(1)
// next(): O(1)
// hasNext(): O(1)

 class PeekingIterator : public Iterator {
    public:
        int curNext=0;
        bool curHasNext=false;
        PeekingIterator(const vector<int>& nums) : Iterator(nums) {
            // Initialize any member here.
            // **DO NOT** save a copy of nums and manipulate it directly.
            // You should only use the Iterator interface methods.
            curHasNext = Iterator :: hasNext();
            if(curHasNext){
                curNext = Iterator :: next();
            }
            
        }
        
        // Returns the next element in the iteration without advancing the iterator.
        int peek() {
            return curNext;
        }
        
        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        int next() {
            int ans = curNext;
            curHasNext = Iterator :: hasNext();
            if(curHasNext){
                curNext = Iterator :: next();
            }
            return ans;
        }
        
        bool hasNext() const {
            return curHasNext;
        }
    };