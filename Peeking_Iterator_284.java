//Time Complexity : O(1)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Peeking_Iterator_284 implements Iterator<Integer> {
    Iterator<Integer> iter;
    int currElement;
    boolean flag;
	public Peeking_Iterator_284(Iterator<Integer> iterator) {
        iter = iterator;
        flag = true;
        currElement = iter.next();
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	//Time Complexity : O(1)
	public Integer peek() {
        return currElement;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	
	//Time Complexity : O(1)
	@Override
	public Integer next() {
	    int temp = currElement;
        if(iter.hasNext())
            currElement = iter.next();
        else
            flag = false;
        return temp;
	}
	
	
	//Time Complexity : O(1)
	@Override
	public boolean hasNext() {
	    return flag;
	}
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Peeking_Iterator_284 iter = new Peeking_Iterator_284(list.iterator());
		System.out.println(iter.peek()); // 1
		System.out.println(iter.next()); // 1
		System.out.println(iter.hasNext()); // true
		System.out.println(iter.peek());  // 2
		System.out.println(iter.next());  // 2 
		System.out.println(iter.next());  // 3
		System.out.println(iter.hasNext()); // false
	}
}
