class Solution {
    public int numWaterBottles(int numBottle, int numExchange) {
        int ans=numBottle;
        while(numBottle >=numExchange){
            int rem = numBottle % numExchange;
            numBottle = numBottle / numExchange;
            ans += numBottle;
            numBottle += rem;
        }
        return ans;
    }
}