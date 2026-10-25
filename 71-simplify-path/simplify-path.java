
class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] arr = path.split("/");

        for (String str : arr) {

            if (str.equals("") || str.equals(".")) {
                continue;
            }

            else if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            else {
                stack.push(str);
            }
        }

        StringBuilder result = new StringBuilder();

        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}
