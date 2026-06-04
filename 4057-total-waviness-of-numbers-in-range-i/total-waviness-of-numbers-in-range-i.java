class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        
        for(int i=num1;i<=num2;i++){
            count+=isHill(i);
        }
        return count;
    }
    public int isHill(int num) {
        String s = String.valueOf(num);
        if (s.length() < 3 || s.length() > 5) return 0;
        int count = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            int prev = s.charAt(i - 1) - '0';
            int curr = s.charAt(i) - '0';
            int next = s.charAt(i + 1) - '0';

            if ((curr > prev && curr > next) ||
                (curr < prev && curr < next)) {
                count++;
            }
        }
        return count;
    }
}