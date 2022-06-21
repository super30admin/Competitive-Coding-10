// Time Complexity : O(m^2*n)
// Space Complexity : O(mn)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    private Map<String, Set<String>> graph = new HashMap();
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        wordList.add(beginWord);
        if(!wordList.contains(endWord)) return 0;
        buildGraph(wordList);
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        
        q.add(beginWord);
        visited.add(beginWord);
        
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                String current = q.poll();
                if(current.equals(endWord)){
                    return level + 1;
                }
                for(String word : graph.getOrDefault(current, new HashSet<>())){
                    if(!visited.contains(word)){
                        q.add(word);
                        visited.add(current);
                    }
                }
            }
            level++;
        }      
        return 0;
    }
    
    public void buildGraph(List<String> dic){
        for(int i = 0; i < dic.size(); i++){
            for(int j = i+1; j < dic.size(); j++){
                String word1 = dic.get(i);
                String word2 = dic.get(j);
                boolean result = isOneDistanceApart(word1, word2);
                if(result){
                    
                    graph.putIfAbsent(word1, new HashSet<>());
                    graph.putIfAbsent(word2, new HashSet<>());
                    
                    graph.get(word1).add(word2);
                    graph.get(word2).add(word1);
                    
                }
            }
        }
    }
    
    private boolean isOneDistanceApart(String word1, String word2){
        int count = 0;
        for(int i = 0; i < word1.length(); i++){
            if(word1.charAt(i) != word2.charAt(i)){
                count++;
            }
            if(count > 1) return false;
        }
        return count == 1;
    }
    
}