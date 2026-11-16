class Solution {
    private final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] units = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num > 0) {
            int group = num % 1000;
            if (group != 0) {
                String part = helper(group);
                if (!units[i].isEmpty()) part += " " + units[i];
                sb.insert(0, part + " ");
            }
            num /= 1000;
            i++;
        }
        return sb.toString().trim();
    }

    private String helper(int n) {
        if (n == 0) return "";
        if (n < 20) return ones[n];
        if (n < 100) return tens[n / 10] + (n % 10 != 0 ? " " + ones[n % 10] : "");
        return ones[n / 100] + " Hundred" + (n % 100 != 0 ? " " + helper(n % 100) : "");
    }
}