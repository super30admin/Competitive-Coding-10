//TC: O(1) for all operations
//SC: O(1) for all operations

/*
 * Below is the interface for Iterator, which is already defined for you.
 * **DO NOT** modify the interface for Iterator.
 *
 *  class Iterator {
 *		struct Data;
 * 		Data* data;
 *  public:
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
    
    int currentval;
    bool currentHN;
    
	PeekingIterator(const vector<int>& nums) : Iterator(nums) {
	    // Initialize any member here.
	    // **DO NOT** save a copy of nums and manipulate it directly.
	    // You should only use the Iterator interface methods.
	    currentHN = Iterator::hasNext();
        if(currentHN){
            currentval = Iterator::next();
        }
        
        
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	int peek() {
        return currentval;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	int next() {
	    
        int retval = currentval;
        
        currentHN = Iterator::hasNext();
        if(currentHN){
            currentval = Iterator::next();
        }
        
        return retval;
        
	}
	
	bool hasNext() const {
	    return currentHN;
	}
};