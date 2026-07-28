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
        int length=0;
        ListNode temp=new ListNode();
        temp.next=head;
        //if(head.val==null)return 0;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        
        length=length/2;
        int demo=0;
        while(demo<length){
            head=head.next;
            demo++;
        }
        return head;
    }
}