class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        for(int num:nums1){
            if(!h1.contains(num)) h1.add(num);
        }
        for(int num:nums2){
            if(!h2.contains(num)) h2.add(num);
        }
        h1.retainAll(h2);
        int size=h1.size();
        int arr[]=new int[size];
        int i=0;
        for(int s:h1){
            arr[i]=s;
            i++;
        }
        return arr;
    }
}