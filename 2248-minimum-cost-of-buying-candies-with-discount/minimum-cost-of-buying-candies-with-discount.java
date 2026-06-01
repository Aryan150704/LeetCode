class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int count=1;
        int c=0;
        for(int i=cost.length-1;i>=0;i--){
            if(count%3!=0){
                c+=cost[i];
            }
            count++;
        }
        return c;
    }
}

// 9 7 6 5 2 2 1