class Solution {
    public int appendCharacters(String s, String t) {
        int position1 = 0;
        int position2 = 0;

        while (position1 < s.length() && position2 < t.length()) {
            if (s.charAt(position1) == t.charAt(position2)) {
                position2++;
            }
            position1++;
        }

        return t.length() - position2;
    }
}
