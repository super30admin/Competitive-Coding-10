//Time complexity:-0(nm).
//space complexiity:- O(n)
//Did it run on leetcode:- No, failing at one testcase, why?
//approach is written in comments.


class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String,ArrayList<String>> graph=new HashMap<>();
        Queue<String> bfs=new LinkedList<String>();
        bfs.add(beginWord);
        int len=beginWord.length();
        
        for(String w: wordList){
            for(int j=0;j<len;j++){
                String word=w.substring(0,j)+'*'+w.substring(j+1,len);
                ArrayList<String> list= graph.getOrDefault(word,new ArrayList<>());
                list.add(w);
                graph.put(word,list);
            }// creation of graph in a hashmap where keys are single parent with * in different positions indicating 
            //single alphabet can be modified , various possibilities of replacing single alphabet are stored as arraylist
            // in value of respective keys.
        }
        HashMap<String,Boolean> visited=new HashMap<>();
        visited.put(beginWord,true);
        int level=0;
        while(!bfs.isEmpty()){//applying bfs iteratively where parent node will be value from hashmap with combination.
            //children node will be adjacentwords in arraylist in hashmap.
            String word=bfs.remove();
            level++;
            for(int i=0;i<len;i++){
                String newword=word.substring(0,i)+'*'+word.substring(i+1,len);
                for(String adjword: graph.getOrDefault(newword,new ArrayList<>())){
                    if(adjword.equals(endWord)){
                        return level;
                    }
                    if(!visited.containsKey(adjword)){
                        visited.put(adjword,false);
                        bfs.add(adjword);
                }
                }
            }
            
            
        }
        return 0;
        
        
        
    }
}