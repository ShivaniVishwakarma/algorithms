import java.util.*;

public class LRUCacheImpl {

	/**
	 * We are given total possible page numbers that can be referred. 
	 * We are also given cache (or memory) size (Number of page frames that cache can hold at a time). 
	 * The LRU caching scheme is to remove the least recently used frame when the cache is full 
	 * and a new page is referenced which is not there in cache.
	 */
	  
    Set<Integer> cache; 
    int capacity; 
  
    public LRUCacheImpl(int capacity) 
    { 
        this.cache = new LinkedHashSet<Integer>(capacity); 
        this.capacity = capacity; 
    } 
  
    // This function returns false if key is not 
    // present in cache. Else it moves the key to 
    // front by first removing it and then adding 
    // it, and returns true. 
    public boolean get(int key) 
    { 
        if (!cache.contains(key)) 
            return false; 
        cache.remove(key); 
        cache.add(key); 
        return true; 
    } 
  
    /* Refers key x with in the LRU cache */
    public void refer(int key) 
    {         
        if (get(key) == false) 
           put(key); 
    } 
  
    // display contents of cache 
    public void display() 
    { 
        Iterator<Integer> itr = cache.iterator(); 
        while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        } 
    } 
      
    public void put(int key) 
    { 
        // If already present, then  
        // remove it first. Note that 
        // we are going to add later 
        if (cache.contains(key))  
            cache.remove(key); 
  
        // If cache size is full, remove the least 
        // recently used. 
        else if (cache.size() == capacity) { 
            int firstKey = cache.iterator().next(); 
            cache.remove(firstKey); 
        } 
  
        cache.add(key); 
    } 
      
    public static void main(String[] args) 
    { 
    	LRUCacheImpl ca = new LRUCacheImpl(4); 
        ca.refer(1); 
        ca.refer(2); 
        ca.refer(3); 
        ca.refer(1); 
        ca.refer(4); 
        ca.refer(5); 
        ca.display(); 
    } 
}


