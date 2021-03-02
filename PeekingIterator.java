/**
Time Complexity : O(!)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : checking some boundary conditions
**/
class PeekingIterator implements Iterator<Integer> 
{
    private Iterator<Integer> iterator;
    private Integer current;
    
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        
        this.iterator = iterator;
        this.current = null;
        
    }
    
    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() 
    {
        if(this.current == null)
        {
            this.current = this.iterator.next();
            return this.current;
        
        }
        else
        {
            return this.current;
        }
        
    }
    
    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() 
    {
        if(this.current == null)
        {
            return this.iterator.next();
        
        }
        else
        {
            int prev = this.current;
            
            if(this.iterator.hasNext())
            {
                this.current = this.iterator.next();
            }
            else
            {
                this.current = null;
            }
            
            return prev;
        }
    }
    
    @Override
    public boolean hasNext() 
    {
        return this.current != null || this.iterator.hasNext();
    }
}