class MyHashMap {
    private int[] storage;
    public MyHashMap() {
        storage = new int[1000001];
        Arrays.fill(storage, -1); // Fill the array with -1 to denote empty slots
    }
    public void put(int key, int value) {
        storage[key] = value; 
    }
    public int get(int key) {
        return storage[key];
    }
    public void remove(int key) {
        storage[key] = -1;
    }
}

/* Example usage:
 * MyHashMap hashMap = new MyHashMap();
 * hashMap.put(1, 1);          // The map is now {1=1}
 * hashMap.put(2, 2);          // The map is now {1=1, 2=2}
 * int value = hashMap.get(1); // Returns 1
 * hashMap.remove(2);          // Removes the mapping for key 2
 * value = hashMap.get(2);     // Returns -1 (not found)
 */
