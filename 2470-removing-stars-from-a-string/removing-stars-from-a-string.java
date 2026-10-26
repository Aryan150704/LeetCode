class Solution {
    public String removeStars(String s) {
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '*') {
                st.deleteCharAt(st.length() - 1);
            } else {
                st.append(ch);
            }
        }

        return st.toString();
    }
}