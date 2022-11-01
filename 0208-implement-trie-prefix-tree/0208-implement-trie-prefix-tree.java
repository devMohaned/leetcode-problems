class TrieNode{
        public boolean isCompleteWord = false;
        public HashMap<Character, TrieNode> children = new HashMap();
        

        public void updateWord(boolean isCompleted){
            isCompleteWord = isCompleted;
        }
    }
    
class Trie {
    
    
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current = root;
        for(char c : word.toCharArray())
        {
            
    if(!current.children.containsKey(c))
        current.children.put(c, new TrieNode());

            
            current = current.children.get(c);
        }
        current.updateWord(true);
    }
    
    public boolean search(String word) {
        TrieNode current = root;
        for(char c : word.toCharArray())
        {
                   
    if(!current.children.containsKey(c)) 
        return false;

            
            current = current.children.get(c);
        }
        return current.isCompleteWord;
    }
    
    public boolean startsWith(String prefix) {
         TrieNode current = root;
        for(char c : prefix.toCharArray())
        {
                    
    if(!current.children.containsKey(c)) 
       return false;

            
            current = current.children.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */