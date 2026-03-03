using System.Collections.Generic;

public class PeekingIterator
{
    private IEnumerator<int> _iterator;
    private bool _hasNext;
    private int _next;

    public PeekingIterator(IEnumerator<int> iterator)
    {
        _iterator = iterator;
        _hasNext = true;
    }

    public int Peek()
    {
        return _iterator.Current;;
    }

    public int Next()
    {
        int result = _iterator.Current;

        _hasNext = _iterator.MoveNext();

        return result;
    }

    public bool HasNext()
    {
        return _hasNext;
    }
}