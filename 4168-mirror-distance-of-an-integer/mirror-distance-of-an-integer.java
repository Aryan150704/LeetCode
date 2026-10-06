class Solution {
    public int mirrorDistance(int n) {
        int before=n;
        int after =0;
        while(n>0){
            after=after*10+n%10;
            n=n/10;
        }
        //System.out.print(before+" "+after);
        return Math.abs(before-after);
    }
}