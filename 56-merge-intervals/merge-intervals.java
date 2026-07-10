class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ll=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int first=intervals[0][0];
        int last=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(last<intervals[i][0]){
                ll.add(new int[]{first,last});
                first=intervals[i][0];
                last=intervals[i][1];
            }
            else{
                last = Math.max(last, intervals[i][1]);
            }
           System.out.println(i+"-"+first+" "+last);
            
        }
        ll.add(new int[]{first,last});

            
        return  ll.toArray(new int[ll.size()][]);
    }
}