//Time Complexity- O(1)
//Space Complexity- O(1)

class PeekingIterator : public Iterator {
    public:
    int next_val; 
    bool iter_hasnext; 
	PeekingIterator(const vector<int>& nums) : Iterator(nums) {
        iter_hasnext=Iterator::hasNext(); 
	    if (iter_hasnext)
            next_val = Iterator::next(); 
	}
	
	int peek() {
        return next_val; 
	}
	
	int next() {
	    int curr_next = next_val; 
        
        iter_hasnext=Iterator::hasNext(); 
	    if (iter_hasnext) 
            next_val = Iterator::next(); 
        
	    return curr_next; 
	}
	
	bool hasNext() const {
	    return iter_hasnext; 
	}
};