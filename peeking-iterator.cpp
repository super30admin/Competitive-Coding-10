// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

#include <vector>
using namespace std;

class Iterator {
public:
    struct Data;
    Data* data;
    Iterator(const vector<int>& nums);
    Iterator(const Iterator& iter);
    int next();
    bool hasNext() const;
};

class PeekingIterator {
private:
    int nextValue;
    bool hasNextValue;
    Iterator* iter;

public:
    PeekingIterator(const vector<int>& nums) : nextValue(0), hasNextValue(false), iter(new Iterator(nums)) {
        if (iter->hasNext()) {
            nextValue = iter->next();
            hasNextValue = true;
        }
    }

    int peek() {
        return nextValue;
    }

    int next() {
        int returnValue = nextValue;
        if (iter->hasNext()) {
            nextValue = iter->next();
        } else {
            hasNextValue = false;
        }
        return returnValue;
    }

    bool hasNext() const {
        return hasNextValue;
    }
};
