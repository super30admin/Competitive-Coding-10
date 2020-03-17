import java.util.*;

// Time Complexity : O(1) for All operations
// Space Complexity : O(1) for All operations
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

/*
we can store cache value immediately in the constructor and then again in the next(...) method. This greatly simplifies the code, because we no longer need conditionals to check whether or not we are currently storing a peeked at value.
*/

public class PeekingIterator implements Iterator<Integer>{

    private Iterator<Integer> itr;
    private Integer cache;

    public PeekingIterator(Iterator<Integer> itr){
        this.itr = itr;
        if(itr.hasNext()){
            this.cache = itr.next();
        }
    }
    public int peek(){
        return cache;
    }

    @Override
    public int next(){
        int res = cache;
        cache = it.hasNext() ? it.next() : null;
        return res;
    }

    @Override
    public boolean hasNext(){
        return cache  != null;
    }
}