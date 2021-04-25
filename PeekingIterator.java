// Time Complexity : O(1) for all 3 operations
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;
import java.util.ArrayList;
class PeekingIterator implements Iterator<Integer>{
    public Iterator<Integer> i;
    public Integer temp;
    public PeekingIterator(Iterator<Integer> itr){
        i = itr;
        if(i.hasNext())
            temp = i.next();
    }
    public Integer next(){
        Integer j=null;
        if(temp != null)
            j = temp;
        if(i.hasNext())
            temp = i.next();
        else
            temp = null;
        return j;
    }
    public boolean hasNext(){
        return temp!=null;
    }
    public Integer peek(){
        if(temp != null)
            return temp;
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> itr = list.iterator();
        PeekingIterator pk = new PeekingIterator(itr);
        System.out.println(pk.next());
        System.out.println(pk.hasNext());
        System.out.println(pk.peek());
        System.out.println(pk.peek());
        System.out.println(pk.next());
        System.out.println(pk.peek());
        System.out.println(pk.next());
        System.out.println(pk.next());
        System.out.println(pk.peek());
        System.out.println(pk.peek());
    }
}
