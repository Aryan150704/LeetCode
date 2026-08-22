class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        
        int[] need = new int[128];
        for (char c : t.toCharArray()) need[c]++;
        
        int required = t.length();
        int left = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (need[c] > 0) required--;
            need[c]--;
            
            while (required == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                need[leftChar]++;
                if (need[leftChar] > 0) required++;
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}