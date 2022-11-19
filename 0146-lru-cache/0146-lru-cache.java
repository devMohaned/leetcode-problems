class LRUCache {

    HashMap<Integer, Integer> map;
   Deque<Integer> lastPossibleEvict;
    int cap;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        lastPossibleEvict = new LinkedList();
        cap = capacity;
    }
    
    public int get(int key) {
    if(!map.containsKey(key)) return -1;
        
        lastPossibleEvict.remove(key);
        lastPossibleEvict.offerFirst(key);
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
        map.put(key, value);
        lastPossibleEvict.remove(key);
        lastPossibleEvict.offerFirst(key);
        }
        else{
            if(map.size() >= cap)
            {
                int toBeRemoved = lastPossibleEvict.removeLast();
                map.remove(toBeRemoved);
            }
            lastPossibleEvict.offerFirst(key);
            map.put(key, value);

            
        }
    }
    
    private void evictRecent()
    {
        int key = lastPossibleEvict.removeLast();
        System.out.println("Removed At Last: " + key);
        map.remove(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */