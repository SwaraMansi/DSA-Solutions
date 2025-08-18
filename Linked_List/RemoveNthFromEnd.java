// LeetCode 19: Remove Nth Node From End of List (Linked List)
public class RemoveNthFromEnd {
    static class Node { int val; Node next; Node(int v){val=v;} }
    public Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0); dummy.next = head;
        Node fast = dummy, slow = dummy;
        for (int i=0;i<n;i++) fast = fast.next;
        while (fast.next != null) { fast = fast.next; slow = slow.next; }
        slow.next = slow.next.next;
        return dummy.next;
    }
    static void print(Node n){ while(n!=null){ System.out.print(n.val + (n.next!=null?"->":"")); n=n.next; } System.out.println(); }
    public static void main(String[] args) {
        Node h = new Node(1); h.next=new Node(2); h.next.next=new Node(3); h.next.next.next=new Node(4); h.next.next.next.next=new Node(5);
        RemoveNthFromEnd s = new RemoveNthFromEnd();
        Node r = s.removeNthFromEnd(h, 2); // remove 4
        print(r); // 1->2->3->5
    }
}
