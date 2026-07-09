class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int t1=Integer.MAX_VALUE;
        int t2=Integer.MAX_VALUE;
        int c1=0;
        int c2=0;
        List<Integer> ll=new ArrayList<>();
               
        for (int n : nums) {
            if (c1 > 0 && n == t1) {
                c1++;
            } 
            else if (c2 > 0 && n == t2) {
                c2++;
            } 
            else if (c1 == 0) {
                t1 = n;
                c1 = 1;
            } 
            else if (c2 == 0) {
                t2 = n;
                c2 = 1;
            } 
            else {
                c1--;
                c2--;
            }
        }

        System.out.print(t1+" "+c1+" "+t2+" "+c2);
        c1=0;
        c2=0;
        for(int n:nums){
            if(n==t1)c1++;
            if(n==t2)c2++;
        }
       
        if(c1>nums.length/3 && c2>nums.length/3){
            if(t1>t2){
                ll.add(t2);
                ll.add(t1);
            }
            else if(t1==t2){
                ll.add(t1);
            }
            else {
                ll.add(t1);
                ll.add(t2);
            }
        }
        else{
            if(c1>nums.length/3){
                ll.add(t1);
            }
            else if(c2>nums.length/3  && t1 != t2) ll.add(t2);
            
        }
        return ll;
    }
}