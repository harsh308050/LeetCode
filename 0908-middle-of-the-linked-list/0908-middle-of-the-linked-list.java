/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode turtle = head;
        ListNode rabit = head;
        while (rabit != null && rabit.next != null) {
            turtle = turtle.next;
            rabit = rabit.next.next;
        }
        return turtle;
    }
}
