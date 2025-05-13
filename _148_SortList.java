public class _148_SortList {

    // Định nghĩa class ListNode
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Hàm sortList chính
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    // Tìm điểm giữa của danh sách
    private ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) prev.next = null; // cắt chuỗi
        return slow;
    }

    // Gộp hai danh sách đã sắp xếp
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    // Hàm để in danh sách (dùng để test)
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Hàm main để test
    public static void main(String[] args) {
        _148_SortList sorter = new _148_SortList();

        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        System.out.println("Before sort:");
        sorter.printList(head);

        ListNode sorted = sorter.sortList(head);
        System.out.println("After sort:");
        sorter.printList(sorted);
    }
}
