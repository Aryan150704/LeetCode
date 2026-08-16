class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> hm =new HashMap<>();
        for(int i=0;i<names.length;i++){
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] arr=new String[heights.length];
        for(int i=0;i<heights.length;i++){
            arr[i]=hm.get(heights[heights.length-i-1]);
        }
        return arr;
    }
}