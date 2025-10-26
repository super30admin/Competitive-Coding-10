// Problem: Implement Peeking Iterator
//  Time Complexity : O(1)
//  Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach in three
// sentences only
// 1. We intialize two member variables peeked = false, peekedVal
// 2. For next, if we haven't peeked then return Iterator::next(), if yes, then
// return peekedVal
// 3. For peek, if we haven't peeked, we set peeked = true, peedkVal =
// Iterator::next()
// 4. For hasNext, we check if we have peeked or Iterator::hasNext(), if either
// of them returns true we have an element

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
#include <bits/stdc++.h>
using namespace std;

class Iterator {
  struct Data;
  Data *data;

public:
  Iterator(const vector<int> &nums);
  Iterator(const Iterator &iter);

  // Returns the next element in the iteration.
  int next();

  // Returns true if the iteration has more elements.
  bool hasNext() const;
};

#include <bits/stdc++.h>
using namespace std;

class PeekingIterator : public Iterator {
private:
  bool peeked;
  int peekedValue;

public:
  PeekingIterator(const vector<int> &nums) : Iterator(nums) {
    // Initialize any member here.
    // **DO NOT** save a copy of nums and manipulate it directly.
    // You should only use the Iterator interface methods.
    peeked = false;
  }

  // Returns the next element in the iteration without advancing the iterator.
  int peek() {
    if (!peeked) {
      peeked = true;
      peekedValue = Iterator::next();
    }
    return peekedValue;
  }

  // hasNext() and next() should behave the same as in the Iterator interface.
  // Override them if needed.
  int next() {
    if (!peeked)
      return Iterator::next();
    peeked = false;
    return peekedValue;
  }

  bool hasNext() const { return peeked || Iterator::hasNext(); }
};
