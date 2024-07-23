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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==n){
            head=head.next;
            return head;
        }
        temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(size-n==cnt){
              temp.next=temp.next.next;  
            }
            temp=temp.next;
        }
        return head;
    }
}