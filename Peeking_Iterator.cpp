// Time Complexity : O(1) as we will be fetching only one value at a time for each opetration
// Space Complexity : O(1) we are not creating any space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no issues as of now.. Learning
/*
 * Below is the interface for Iterator, which is already defined for you.
 * **DO NOT** modify the interface for Iterator.
 *
 *  class Iterator {
 *		struct Data;
 * 		Data* data;
 *		Iterator(const vector<int>& nums);
 * 		Iterator(const Iterator& iter);
 *
 * 		// Returns the next element in the iteration.
 *		int next();
 *
 *		// Returns true if the iteration has more elements.
 *		bool hasNext() const;
 *	};
 */

class PeekingIterator : public Iterator {
public:
    int val = NULL;
	PeekingIterator(const vector<int>& nums) : Iterator(nums) {
	    // Initialize any member here.
	    // **DO NOT** save a copy of nums and manipulate it directly.
	    // You should only use the Iterator interface methods.
        
        if(Iterator::hasNext()){
            val = Iterator::next();
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	int peek() {
        return val;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	int next() {
	    int copy = val;
         
        if(Iterator::hasNext()){
            val = Iterator::next();
        }else{
            val = NULL;
        }
        
        return copy;
        
	}
	
	bool hasNext() const {
	    if(val == NULL){
            return false;
        }else{
            return true;
        }
	}
};