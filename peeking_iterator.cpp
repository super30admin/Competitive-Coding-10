// Time Complexity : O(1)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class PeekingIterator : public Iterator {
private:
    vector<int> nums_data;
    int ptr;
    
public:
	PeekingIterator(const vector<int>& nums) : Iterator(nums) {
	    // Initialize any member here.
	    // **DO NOT** save a copy of nums and manipulate it directly.
	    // You should only use the Iterator interface methods.
	    
        nums_data = nums;
        ptr = 0;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	int peek() {
        return nums_data[ptr];
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	int next() {
        int val = nums_data[ptr];
        ptr++;
        
        return val;
	}
	
	bool hasNext() const {
	    if(ptr >= nums_data.size())
            return false;
        else
            return true;
	}
};