class Solution {
    public String frequencySort(String s) {
        int[] arr=new int[126];
        int high=0;
        for(int i=0;i<s.length();i++){
            arr[((int)s.charAt(i))]+=1;
            high=Math.max(high,arr[((int)s.charAt(i))]);
        }
        StringBuilder sb=new StringBuilder();
        for(int j=high;j>0;j--){
            for(int i=0;i<126;i++){
                if(arr[i]==j){
                    while(arr[i]>0){
                        sb.append((char)(i));
                        arr[i]--;
                    }
                }
            }
        }
        
        return sb.toString();
    }
}