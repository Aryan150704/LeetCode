class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hp1=new HashMap<>();
        HashMap<Integer,Integer> hp2=new HashMap<>();
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums1){
            if(!hp1.containsKey(num)){
                hp1.put(num,0);
            }
            hp1.put(num,hp1.get(num)+1);
            if(!h1.contains(num))h1.add(num);
        }
        for(int num:nums2){
            if(!hp2.containsKey(num)){
                hp2.put(num,0);
            }
            hp2.put(num,hp2.get(num)+1);
            if(!h2.contains(num)){
                h2.add(num);
            }
            
        }
        h1.retainAll(h2);
        for(int num:h1){
            int count=Math.min(hp1.get(num),hp2.get(num));
            while(count>0){
                arr.add(num);
                count--;
            }
        }
        int[] ans=new int[arr.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}