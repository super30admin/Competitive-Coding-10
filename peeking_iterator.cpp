// Time Complexity : O(1)
// Space Complexity : O(1)
// Any problem you faced while coding this :

//Understanding that saving the peek value in the constructor took some time during interview
//Lack of knowledge in iterators hindered the progress towards the solution

// Your code here along with comments explaining your approach
//1. Get the value and keep it ready for peeking
//2. Return current value if the value is present
//3. Respond  aacordingly if the value is not present

class PeekingIterator : public Iterator {
public:
    int curr=INT_MIN;
	PeekingIterator(const vector<int>& nums) : Iterator(nums) {
	    // Initialize any member here.
	    // **DO NOT** save a copy of nums and manipulate it directly.
	    // You should only use the Iterator interface methods.
        if(Iterator::hasNext()){
           curr= Iterator::next();
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	int peek() {
        return curr;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	int next() {
        int temp;
        temp = curr;
        if(Iterator::hasNext()){
            curr= Iterator::next();
        }else{
            curr=INT_MIN;
        }
        return temp;
	}
	
	bool hasNext() const {
	    if(curr!= INT_MIN) return true;
        else return false;
	}
};
