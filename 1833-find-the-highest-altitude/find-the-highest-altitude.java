class Solution {
    public int largestAltitude(int[] gain) {
        int highestAltitude=0;
        int currentAltitude=0;
        for(int i=0;i<gain.length;i++){
            currentAltitude+=gain[i];
            highestAltitude=Math.max(highestAltitude,currentAltitude);
        }
        return highestAltitude;
    }
}