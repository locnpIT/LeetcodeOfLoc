import java.util.ArrayList;
import java.util.List;

public class _206_ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
    public static void printList(ListNode head) {
        List<Integer> listVals = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            listVals.add(current.val);
            current = current.next;
        }
        System.out.println(listVals);
    }
    // --- Kết thúc Hàm phụ trợ ---


    // --- Phần Test trong main ---
    public static void main(String[] args) {
        _206_ReverseLinkedList solution = new _206_ReverseLinkedList();

        // Trường hợp 1: Danh sách thông thường
        System.out.println("Trường hợp 1: Danh sách [1, 2, 3, 4, 5]");
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.print("Danh sách gốc: ");
        printList(head1);

        ListNode reversedHead1 = solution.reverseList(head1);

        System.out.print("Danh sách sau khi đảo ngược: ");
        printList(reversedHead1); // Kết quả sẽ phụ thuộc vào logic của reverseList
        System.out.println("--------------------");


        // Trường hợp 2: Danh sách rỗng
        System.out.println("Trường hợp 2: Danh sách rỗng []");
        ListNode head2 = null;

        System.out.print("Danh sách gốc: ");
        printList(head2);

        ListNode reversedHead2 = solution.reverseList(head2);

        System.out.print("Danh sách sau khi đảo ngược: ");
        printList(reversedHead2);
        System.out.println("--------------------");


        // Trường hợp 3: Danh sách có một phần tử
        System.out.println("Trường hợp 3: Danh sách [1]");
        ListNode head3 = new ListNode(1);

        System.out.print("Danh sách gốc: ");
        printList(head3);

        ListNode reversedHead3 = solution.reverseList(head3);

        System.out.print("Danh sách sau khi đảo ngược: ");
        printList(reversedHead3);
        System.out.println("--------------------");


         // Trường hợp 4: Danh sách có hai phần tử
        System.out.println("Trường hợp 4: Danh sách [1, 2]");
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);

        System.out.print("Danh sách gốc: ");
        printList(head4);

        ListNode reversedHead4 = solution.reverseList(head4);

        System.out.print("Danh sách sau khi đảo ngược: ");
        printList(reversedHead4); // Kết quả sẽ phụ thuộc vào logic của reverseList
        System.out.println("--------------------");
    }
    // --- Kết thúc Phần Test ---


    
 

    public ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        while(curNode!= null && curNode.next != null){
            ListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }

        return head;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode curNode = head;
        while(curNode!= null && curNode.next != null){
            ListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }

        return head;
    } 
    public ListNode reverseList3(ListNode head) {
        ListNode curNode = head;
        while(curNode!= null && curNode.next != null){
            ListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }

        return head;
    }
// commit to githubbb
// how can i do upload to guthib


}
