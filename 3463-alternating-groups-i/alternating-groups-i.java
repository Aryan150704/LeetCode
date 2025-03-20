class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int prev=0;
        int cur=0;
        int next=0;
        int count=0;
        int n=colors.length;
        for(int i=0;i<n;i++){
            prev=colors[(i)%n];
            cur=colors[(i+1)%n];
            next=colors[(i+2)%n];
            if(prev!=cur&&cur!=next)
            count++;
        }
        return count;
    }
}