//time complexity : O(1) for peek(), hasNext() and next()
//space complexity: O(1)
//executed on leetcode: yes 

import java.util.List;
import java.util.ArrayList;
public class Iterator<T> {
    int index;
    List<T> li;
    public Iterator(List<T> list)
    {
        li = list;
        index = 0;
    }
    T next()
    {
        if(li.get(index)!=null)
        {
            return li.get(index++);
        }
        return null;
    }

    T peek(){
        if(li.get(index)!=null)
        {
            return li.get(index);
        }
        else return null;
    }

    boolean hasNext(){
        if(index<li.size()) return true;
        else return false;
    }
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        for(char c='a';c<='c';++c) list.add(c);
        Iterator<Character> it = new Iterator<Character>(list);
        while(it.hasNext())
        {
            System.out.print(it.next()+ " ");
        }
    }
}
