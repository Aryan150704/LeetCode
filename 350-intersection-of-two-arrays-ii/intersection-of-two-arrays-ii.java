class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int num:nums1){
            if(!h1.containsKey(num)){
                h1.put(num,0);
            }
            h1.put(num,h1.get(num)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums2){
            if(h1.containsKey(num)){
                if(h1.get(num)>0) {
                    h1.put(num,h1.get(num)-1);
                    arr.add(num);
                }
            }
        }
        int[] ans=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}