class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count=numBottles;
        int empty=numBottles;
        numBottles=0;
        while(empty>=numExchange){
            empty-=numExchange;
            numBottles++;
            numExchange++;
            if(empty<numExchange && numBottles>0){
                empty+=numBottles;
                count+=numBottles;
                numBottles=0;
            }
        }
        return count;
    }
}