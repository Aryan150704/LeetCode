class MyCircularQueue {
    int[] queue;
    int size;
    int front;
    int capacity;

    public MyCircularQueue(int k) {
        this.queue = new int[k];
        this.size = 0;
        this.capacity = k;
        this.front = 0;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        int index = (front + size) % capacity;
        queue[index] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
         if (isEmpty())
            return -1;
        return queue[front];
    }

    public int Rear() {
        if (isEmpty())
            return -1;
        int index = (front + size - 1) % capacity;
        return queue[index];

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
      return size == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */