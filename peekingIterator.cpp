// Time Complexity : O(1) for all   
// Space Complexity : O(1)
// Did this code succesfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// 1. Store next element as cache and a bool variable of whether there is a next element
// 2. Initialize cache with first element and bool with whether nums has first element

// next()
// 1. Store cache in a result variable
// 2. See if nums has next element and update cache and bool accordingly
// 3. Return result

// peek()
// 1. Always just return cache

// hasNext()
// 1. Always just return the bool variable

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
    int cache;
    bool hn;
	PeekingIterator(const vector<int>& nums) : Iterator(nums) {
	    // Initialize any member here.
	    // **DO NOT** save a copy of nums and manipulate it directly.
	    // You should only use the Iterator interface methods.
	    if(Iterator::hasNext()){
            cache = Iterator::next();
            hn=true;
        }
        else{
            cache = -1;
            hn=false;
        } 
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	int peek() {
        return cache;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	int next() {
	    int num = cache;
        hn = Iterator::hasNext();
        if(Iterator::hasNext())
            cache = Iterator::next();
        else
            cache = -1;
        return num;
	}
	
	bool hasNext() const {
	    return hn;
	}
};