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
    public int getDecimalValue(ListNode head) {
        StringBuilder num = new StringBuilder();
        while(head != null){
            num.append(head.val);
            head = head.next;
        }
        int ans = 0;
        int count = 0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='1'){
                ans += (int)Math.pow(2,count);
            }
            count++;
        }
        return ans;
    }
}