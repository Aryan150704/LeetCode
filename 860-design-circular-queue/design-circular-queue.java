class MyCircularQueue {
  public MyCircularQueue(int k) {
    this.k = k;
    this.q = new int[k];
    this.rear = k - 1;
  }
  public boolean enQueue(int value) {
    if (isFull())
      return false;

    rear = ++rear % k;
    q[rear] = value;
    ++size;
    return true;
  }
  public boolean deQueue() {
    if (isEmpty())
      return false;

    front = ++front % k;
    --size;
    return true;
  }
  public int Front() {
    return isEmpty() ? -1 : q[front];
  }
  public int Rear() {
    return isEmpty() ? -1 : q[rear];
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public boolean isFull() {
    return size == k;
  }

  private final int k;
  private int[] q;
  private int size = 0;
  private int front = 0;
  private int rear;
}