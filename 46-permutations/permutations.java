class Solution {
    public  void backtracking(List<List<Integer>> arr,ArrayList<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            arr.add(new ArrayList<>(temp));
            return ;
        } 
        for(int number : nums){
            if(temp.contains(number))
            continue;
            temp.add(number);
            backtracking(arr,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        backtracking(arr,new ArrayList<>(),nums);
        return arr;
    }
}