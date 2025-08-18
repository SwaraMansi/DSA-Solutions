// LeetCode 2: Add Two Numbers (Linked List)
public class AddTwoNumbers {
    static class Node { int val; Node next; Node(int v){val=v;} }
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0), cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            cur.next = new Node(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
    static void print(Node n){ while(n!=null){ System.out.print(n.val + (n.next!=null?"->":"")); n=n.next; } System.out.println(); }
    public static void main(String[] args) {
        Node a = new Node(2); a.next=new Node(4); a.next.next=new Node(3);
        Node b = new Node(5); b.next=new Node(6); b.next.next=new Node(4);
        AddTwoNumbers s = new AddTwoNumbers();
        print(s.addTwoNumbers(a,b)); // 7->0->8
    }
}
