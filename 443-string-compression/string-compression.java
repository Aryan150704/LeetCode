class Solution {
    public int compress(char[] chars) {
        char curr = chars[0];
        int count = 1;
        int j = 0;

        for (int i = 1; i <= chars.length; i++) {

            if (i == chars.length || chars[i] != curr) {

                chars[j++] = curr;

                if (count > 1) {
                    String num = String.valueOf(count);

                    for (char c : num.toCharArray()) {
                        chars[j++] = c;
                    }
                }

                if (i < chars.length) {
                    curr = chars[i];
                    count = 1;
                }

            } else {
                count++;
            }
        }

        return j;
    }
}