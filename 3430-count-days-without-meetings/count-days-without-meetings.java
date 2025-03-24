import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int countDays(int days, int[][] meetings) {
        int ans = 0;
        if (meetings.length == 0) {
            return days;
        }

        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        if (meetings[0][0] > 1) {
            ans = meetings[0][0] - 1;
        }
        int currentEnd = meetings[0][1];
        for (int i = 1; i < meetings.length; i++) {
            if (meetings[i][0] <= currentEnd) {
                currentEnd = Math.max(currentEnd, meetings[i][1]);
            } else {
                ans += meetings[i][0] - currentEnd - 1;
                currentEnd = meetings[i][1];
            }
        }
        if (currentEnd < days) {
            ans += days - currentEnd;
        }
        return ans;
    }
}