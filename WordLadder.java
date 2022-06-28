class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String, ArrayList<String>> edges = new HashMap<>();
        Queue<String> q = new LinkedList<String>();
        q.add(beginWord);

        int length = beginWord.length();
        for(String word: wordList){
            for(int j=0; j< length; j++){
                String wrd = word.substring(0,j) + "*" + word.substring(j+1,length);
                ArrayList<String> list = edges.getOrDefault(wrd, new ArrayList<>());
                list.add(word);
                edges.put(wrd,list);
            }
        }
        int level =0;

        HashMap<String, Boolean> visited = new HashMap<>();
        visited.put(beginWord,true);
        while(!q.isEmpty()){
            int size = q.size();
            level+=1;
            for(int k =0; k<size; k++){
                String word = q.remove();
                for(int i =0; i<length; i++){
                    String newWord = word.substring(0,i) + "*" + word.substring(i+1,length);
                    for(String adjWord: edges.getOrDefault(newWord, new ArrayList<>())){
                        System.out.println(adjWord);
                        if(adjWord.equals(endWord)) return level+1;
                        if(!visited.containsKey(adjWord)){
                            visited.put(adjWord,true);
                            q.add(adjWord);
                        }
                    }
                }
            }
        }
        return 0;
        
        
    }
}