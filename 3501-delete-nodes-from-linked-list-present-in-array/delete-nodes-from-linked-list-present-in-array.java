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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        Set<Integer>st = new HashSet();
        for(int i : nums)st.add(i);

        while(pre.next != null){
            if(st.contains(pre.next.val))pre.next = pre.next.next;
            else pre = pre.next;
        }
        return temp.next;
    }
}