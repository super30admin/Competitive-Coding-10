/**
 * @Time complexity:
 * O(1)
 * 
 */

/**
 * @Space Complexity:
 * O(1)
 * 
 */

/**
 * Approach:
 * When the next is called we have to give 
 * the current value and move the pointer by
 * 1. When peek is called it should give
 * the value where pointer is. It is not 
 * incrementing the pointer.
 * 
 * So we are just making sure that
 * whenever the next is called it moves
 * the pointer by 1 and store the value
 * in the nextVal variable. And to return 
 * the value to which it was pointing earlier
 * we store it in temp. The value stored
 * in nextVal is initialized in the constructor
 * to reduce the calculations.
 * 
 */

// The code ran perfectly on leetcode

class PeekingIterator : public Iterator {
    bool hasN;
    int nextVal;
public:
	PeekingIterator(const vector<int>& nums) : Iterator(nums) {
	    // Initialize any member here.
	    // **DO NOT** save a copy of nums and manipulate it directly.
	    // You should only use the Iterator interface methods.
        
        hasN = Iterator::hasNext();
        if(hasN){
           nextVal = Iterator::next(); 
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	int peek() {
        return nextVal;
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	int next() {
        int temp = nextVal;
        hasN =  Iterator::hasNext();
        if(hasN){
            nextVal = Iterator::next();
        }
        return temp;
	    
	}
	
	bool hasNext() const {
	    return hasN;
	}
};