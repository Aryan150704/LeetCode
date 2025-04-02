class MyCircularQueue {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    Node head, tail;
    int size=0;
    int k=0;
    public MyCircularQueue(int k) {
        this.size=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;

        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
        k++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;

        head=head.next;
        k--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return head.data;
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return tail.data;       
    }
    
    public boolean isEmpty() {
        return head==null;
    }
    
    public boolean isFull() {
        return k==size;
    }
}
