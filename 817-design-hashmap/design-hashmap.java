class MyHashMap {
    private class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10000; 
    private Node[] map;

    public MyHashMap() {
        map = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE; 
    }

    public void put(int key, int value) {
        int index = hash(key);
        if (map[index] == null) {
            map[index] = new Node(-1, -1); 
        }
        Node prev = find(map[index], key);
        if (prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.value = value; 
        }
    }

    public int get(int key) {
        int index = hash(key);
        if (map[index] == null) return -1;
        Node prev = find(map[index], key);
        return prev.next == null ? -1 : prev.next.value;
    }

    public void remove(int key) {
        int index = hash(key);
        if (map[index] == null) return;
        Node prev = find(map[index], key);
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    private Node find(Node bucket, int key) {
        Node prev = bucket;
        while (prev.next != null && prev.next.key != key) {
            prev = prev.next;
        }
        return prev;
    }
}