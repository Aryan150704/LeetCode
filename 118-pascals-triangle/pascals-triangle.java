class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        int count=1;
        while(count<=numRows){
            List<Integer> ll=new ArrayList<Integer>();
            for(int i=0;i<count;i++){
                if(i==0){
                    ll.add(1);
                }
                else if(i==count-1){
                    ll.add(1);
                }
                else{
                    ll.add( l.get(count-2).get(i) + l.get(count-2).get(i-1) );
                }
            }
            l.add(ll);
            count++;
        }
        return l;
    }
}