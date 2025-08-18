// LeetCode 21: Merge Two Sorted Lists (Linked List)
public class MergeTwoSortedLists {
    static class Node { int val; Node next; Node(int v){val=v;} }
    public Node mergeTwoLists(Node a, Node b) {
        Node dummy = new Node(0), cur = dummy;
        while (a != null && b != null) {
            if (a.val < b.val) { cur.next = a; a = a.next; }
            else { cur.next = b; b = b.next; }
            cur = cur.next;
        }
        cur.next = (a != null) ? a : b;
        return dummy.next;
    }
    static void print(Node n){ while(n!=null){ System.out.print(n.val + (n.next!=null?"->":"")); n=n.next; } System.out.println(); }
    public static void main(String[] args) {
        Node a = new Node(1); a.next=new Node(2); a.next.next=new Node(4);
        Node b = new Node(1); b.next=new Node(3); b.next.next=new Node(4);
        MergeTwoSortedLists s = new MergeTwoSortedLists();
        print(s.mergeTwoLists(a,b)); // 1->1->2->3->4->4
    }
}
