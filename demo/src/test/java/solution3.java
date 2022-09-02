class Solution3 {

    public static void main(String[] args) {

        maxDepth("(1+(2*3)+((8)/4))+1");

    }
    public static int maxDepth(String s) {

        int ans = 0, size = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == '(') {
                ++size;
                ans = Math.max(ans, size);
            } else if (ch == ')') {
                --size;
            }
        }
        return ans;


    }
}