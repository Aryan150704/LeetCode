class MyHashSet {
    private boolean[] data;
    public MyHashSet() {
        data = new boolean[1000001];
    }
    public void add(int key) {
        data[key] = true;
    }
    public void remove(int key) {
        data[key] = false;
    }
    public boolean contains(int key) {
        return data[key];
    }
}

/**
 * Usage:
 * MyHashSet hashSet = new MyHashSet();
 * hashSet.add(key); // Adds the item 'key' to the hash set
 * hashSet.remove(key); // Removes 'key' from the set if it's present
 * boolean doesContain = hashSet.contains(key); // Returns 'true' if 'key' is present in the set, otherwise 'false'
 */