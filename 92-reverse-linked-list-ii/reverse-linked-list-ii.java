class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr=head;
        for(int i=1;i<left;i++){
            curr=curr.next;
        }
        ListNode record=curr;
        List<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            arr.add(curr.val);
            curr=curr.next;
        }
        for(int i=0;i<arr.size()/2;i++){
            int temp=arr.get(i);
            arr.set(i,arr.get(arr.size()-i-1));
            arr.set(arr.size()-i-1,temp);
        }
        int k=0;
        while(k<arr.size()){
            record.val=arr.get(k);
            record=record.next;
            k++;
        }
        return head;
    }
}