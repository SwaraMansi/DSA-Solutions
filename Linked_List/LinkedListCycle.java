// LeetCode 141: Linked List Cycle (Linked List)
public class LinkedListCycle {
    static class Node { int val; Node next; Node(int v){val=v;} }
    public boolean hasCycle(Node head) {
        if (head == null) return false;
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            slow = slow.next; fast = fast.next.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node a = new Node(3); Node b = new Node(2); Node c = new Node(0); Node d = new Node(-4);
        a.next=b; b.next=c; c.next=d; d.next=b; // cycle
        System.out.println(new LinkedListCycle().hasCycle(a)); // true
    }
}
