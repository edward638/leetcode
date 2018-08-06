package leetcode;

//You are given two non-empty linked lists representing two non-negative integers.
//        The digits are stored in reverse order and each of their nodes contain a single digit.
//        Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Example:
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.



public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode pointer = res;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int value1 = (l1 == null) ? 0 : l1.val;
            int value2 = (l2 == null) ? 0 : l2.val;
            int total = value1 + value2 + carry;

            if (total >= 10) {
                total -= 10;
                carry = 1;
            } else {
                carry = 0;
            }

            ListNode newNode = new ListNode(total);
            pointer.next = newNode;
            pointer = pointer.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return res.next;
    }
}
