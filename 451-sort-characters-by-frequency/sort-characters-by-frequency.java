class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        int max=0;
        StringBuilder ans=new StringBuilder();
        int[] arr=new int[256];
        for(int i=0;i<n;i++){
            int k=s.charAt(i)-'0';
            arr[k]+=1;
            max=Math.max(max,arr[k]);
            //System.out.println(s.charAt(i)+" "+k+" "+arr[k] +" "+max);
        }
        //System.out.println(max);
        while(max>0){
            for(int i=arr.length-1;i>=0;i--){
            //System.out.println(arr[i]+" "+max);
            if(arr[i]==max){
                int k=max;
                while(k>0){
                    ans.append((char)(i+'0'));
                    //System.out.println((char)(i+k));
                    k--;
                }
            }
            }
            max--;
            
        }
        

        return ans.toString();
    }
}