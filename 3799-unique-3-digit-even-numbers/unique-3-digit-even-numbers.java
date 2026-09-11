class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> hs=new HashSet<>();
        int count=0;
        int n=digits.length;
        for(int i=0;i<n;i++){
            int num=digits[i];
            if(num==0)continue;
            for(int j=0;j<n;j++){
                if(i==j)continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    if (digits[k] % 2 != 0) continue;
                    hs.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                }
            }
        }
        return hs.size();
    }
}