class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        if(numRows==0) return ans;
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        ans.add(arr);
        if(numRows == 1) return ans;
        for(int i=1;i<numRows;i++){
            List<Integer> pre=ans.get(i-1);
            List<Integer> row =new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-1;j++){
                row.add(pre.get(j)+pre.get(j+1));
            }
            row.add(1);
            ans.add(row);
        }
        return ans;
    }
}