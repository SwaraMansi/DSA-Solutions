// LeetCode 206: Reverse Linked List (Linked List)
public class ReverseLinkedList {
    static class Node { int val; Node next; Node(int v){val=v;} }
    public Node reverseList(Node head) {
        Node prev = null, cur = head;
        while (cur != null) {
            Node nxt = cur.next; cur.next = prev; prev = cur; cur = nxt;
        }
        return prev;
    }
    static void print(Node n){ while(n!=null){ System.out.print(n.val + (n.next!=null?"->":"")); n=n.next; } System.out.println(); }
    public static void main(String[] args) {
        Node h = new Node(1); h.next=new Node(2); h.next.next=new Node(3); h.next.next.next=new Node(4); h.next.next.next.next=new Node(5);
        ReverseLinkedList s = new ReverseLinkedList();
        Node r = s.reverseList(h);
        print(r); // 5->4->3->2->1
    }
}
