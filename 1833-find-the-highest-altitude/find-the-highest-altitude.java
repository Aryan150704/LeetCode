class Solution {
    public int largestAltitude(int[] gains) {
        int highestaltitude=gains[0];
        for(int i=1;i<gains.length;i++){
            gains[i]+=gains[i-1];
            if(gains[i]>highestaltitude)
            highestaltitude=gains[i];
        }
        if(highestaltitude<0)
        return 0;
        else 
        return highestaltitude;
    }
}