
// Time Complexity : O(M^2 * N)
// Space Complexity : O(M^2 * N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        HashMap<String,List<String>> tMap = new HashMap<>();
        HashSet<String> visited = new HashSet<>();
        for(String word : wordList){
            for(int i = 0 ; i < word.length() ; i++){
                String newWord = word.substring(0,i)+"*"+word.substring(i+1);
                if(!tMap.containsKey(newWord)) tMap.put(newWord,new ArrayList<>());
                tMap.get(newWord).add(word);
            }
        }
        int level = 1;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        while(!q.isEmpty()){
            int size = q.size();
            level++;
            for(int i = 0 ; i < size ; i++){
                String currentWord = q.poll();
                System.out.println(currentWord);
                for(int j = 0 ; j < currentWord.length() ; j++){
                    String newWord = currentWord.substring(0,j)+"*"+currentWord.substring(j+1);
                    if(tMap.containsKey(newWord)){
                        for(String word : tMap.get(newWord)){
                            if(visited.contains(word)) continue;
                            if(word.equals(endWord)) return level;
                            q.add(word);
                            visited.add(word);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
