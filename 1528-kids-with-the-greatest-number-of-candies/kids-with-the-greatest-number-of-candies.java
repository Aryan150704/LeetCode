class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> ans= new ArrayList<> (candies.length);
        int max=0;
        for(int temp : candies){
            if(max<temp){
                max=temp;
                
            }
            }
          for(int i=0;i<candies.length;i++){
                 if((candies[i]+extraCandies)>=max){
                    ans.add(true);
                 }
                 else{
                      ans.add(false);
                 }

          }
        
        return ans;
        
    }
}