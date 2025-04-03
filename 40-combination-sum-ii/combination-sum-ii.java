class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> help = new ArrayList<>();
        helper(candidates, target, 0, ans, 0, help);
        return ans;
    }

    public void helper(int[] arr, int target, int sum, List<List<Integer>> ans, int idx, List<Integer> help) {
        if (sum == target) {
                ans.add(new ArrayList<>(help));
            return;
            }
        if (idx == arr.length ||sum > target)
            return;

        for(int i=idx;i<arr.length;i++){

            if(i>idx && arr[i]==arr[i-1]) continue;

            help.add(arr[i]);
            helper(arr, target, sum+arr[i], ans, i+1,help);
            help.remove(help.size()-1);
        }       
    }
}