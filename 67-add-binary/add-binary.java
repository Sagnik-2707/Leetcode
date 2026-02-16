class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(n1>=0 || n2>=0 || carry>0)
        {
            int digit1 = (n1>=0)?(a.charAt(n1--) - '0') : 0;
            int digit2 = (n2>=0)?(b.charAt(n2--) - '0') : 0;
            int sum = digit1 + digit2 + carry;
            result.append(sum%2);
            carry = sum/2;
        }
        return result.reverse().toString();
    }
}