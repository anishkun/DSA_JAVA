package Stack;
class Node {
    int val;
    int min;
    Node next;

    Node(int val, int min, Node next) {
        this.val = val;
        this.min = min;
        this.next = next;
    }
}
public class MinStack {
    Node head;

    public MinStack() {
    }

    public void push(int val) {
        if (head == null) head = new Node(val, val, null);
        else head = new Node(val, Math.min(val, head.min), head);
    }

    public void pop() {
        if (head != null) head = head.next;
    }

    public int top() {
        return head == null ? -1 : head.val;
    }

    public int getMin() {
        return head == null ? -1 : head.min;
    }
}
