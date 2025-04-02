// Time Complexity: O(1)
// Space Complexity: O(1)
// Did the code run successfully on Leetcode? Yes

// Approach:
// 1. We are given an iterator and we need to implement a peeking iterator which allows us to peek at the next element in the iteration without advancing the iterator.
// 2. We can do this by storing the next element in a variable and returning it when peek() is called.
// 3. We also need to implement the next() and hasNext() methods which should behave the same as in the Iterator interface.
// 4. We can do this by checking if there is a next element in the iterator and if there is, we can store it in the variable and return it when next() is called.
// 5. If there is no next element, we can set the hasNextElement variable to false and return the stored value.

 class PeekingIterator : public Iterator {
    private: 
        int nextElement; 
        bool hasNextElement;
    public:
        PeekingIterator(const vector<int>& nums) : Iterator(nums) {
            if(Iterator:: hasNext()){
                nextElement = Iterator::next();
                hasNextElement = true;
            }else{
                hasNextElement = false;
            }
            // Initialize any member here.
            // **DO NOT** save a copy of nums and manipulate it directly.
            // You should only use the Iterator interface methods.
            
        }
        
        // Returns the next element in the iteration without advancing the iterator.
        int peek() {
            return nextElement;
        }
        
        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        int next() {
            int value = nextElement;
            if(Iterator :: hasNext()){
                nextElement = Iterator :: next();
            }else{
                hasNextElement = false;
            }
            return value;
        }
        
        bool hasNext() const {
            return hasNextElement;
        }
    };