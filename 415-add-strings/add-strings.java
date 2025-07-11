class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int k = num2.length() - 1;
        int carry = 0;
        while(i>=0 || k>=0 || carry!=0)
        {
            int d1 = (i>=0)? num1.charAt(i) - '0' : 0;
            int d2 = (k>=0)? num2.charAt(k) - '0' : 0;

            int sum = d1+d2+carry;
            carry=sum/10;
            sb.append(sum%10);
            i--;
            k--;
        }
        return sb.reverse().toString();
    }
}