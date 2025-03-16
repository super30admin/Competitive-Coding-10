// TC => O(1)
// SC => O(n) 
// C# IEnumerator interface reference:
// https://docs.microsoft.com/en-us/dotnet/api/system.collections.ienumerator?view=netframework-4.8

class PeekingIterator {
    IEnumerator<int> enumerator;
    public PeekingIterator(IEnumerator<int> iterator) {
        enumerator = iterator;
    }
    
    // Returns the next element in the iteration without advancing the iterator.
    public int Peek() {
        return enumerator.Current;
    }
    
    // Returns the next element in the iteration and advances the iterator.
    public int Next() {
        var current = enumerator.Current;
        enumerator.MoveNext();
        return current;
    }
    
    // Returns false if the iterator is refering to the end of the array of true otherwise.
    public bool HasNext() {
		return enumerator.Current != 0;
    }
}