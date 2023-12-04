public class PeekingIterator
	{
        // Time Complexity : O(1) - All functions Next, Peek and HasNext
        // Space Complexity : O(1) - in place
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        IEnumerator<int> nativeIterator;
        bool hasNext;

        // iterators refers to the first element of the array.
        public PeekingIterator(IEnumerator<int> iterator)
        {
            nativeIterator = iterator;
            hasNext = true;
        }

        // Returns the next element in the iteration without advancing the iterator.
        public int Peek()
        {
            return nativeIterator.Current;
        }

        // Returns the next element in the iteration and advances the iterator.
        public int Next()
        {
            int nextEl = nativeIterator.Current; // Return the stored current element
            hasNext = nativeIterator.MoveNext();
            return nextEl;
        }

        // Returns false if the iterator is refering to the end of the array of true otherwise.
        public bool HasNext()
        {
            return hasNext;
        }
     
    }
