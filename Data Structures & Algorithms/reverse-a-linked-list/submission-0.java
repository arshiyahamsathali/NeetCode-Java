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
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode pre=null;//build from build
        while(cur!=null){
            ListNode next=cur.next;//stores the next address
            cur.next=pre;//build reverse Linked list by linking to previous reference
            pre=cur;
            cur=next;//move to next node until null
        }
        return pre;
    }
}
