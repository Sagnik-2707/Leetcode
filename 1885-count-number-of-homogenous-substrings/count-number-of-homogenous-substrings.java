class Solution {
    public int countHomogenous(String s) {
        int n = s.length();
        long length = 0;
        long result = 0;
        int MOD = 1_000_000_007;

        for (int i = 0; i < n; i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                length++;
            } else {
                length = 1;
            }
            result = (result + length) % MOD;
        }

        return (int) result;
    }
}
