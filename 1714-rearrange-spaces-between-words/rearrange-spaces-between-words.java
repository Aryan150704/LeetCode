class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') spaces++;
        }

        String[] words = text.trim().split("\\s+");
        int n = words.length;

        int between = n == 1 ? 0 : spaces / (n - 1);
        int extra = n == 1 ? spaces : spaces % (n - 1);

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            ans.append(words[i]);

            if (i < n - 1) {
                ans.append(" ".repeat(between));
            }
        }

        ans.append(" ".repeat(extra));
        return ans.toString();
    }
}