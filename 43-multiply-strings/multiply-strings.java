class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || (num2.equals("0")))
            return "0";
        int n1 = num1.length();
        int n2 = num2.length();
        int res[] = new int[n1+n2];
        String a = new StringBuilder(num1).reverse().toString();
        String b = new StringBuilder(num2).reverse().toString();
        for(int i=0;i<n1;i++)
        {
            for(int k=0;k<n2;k++)
            {
                int digit = (a.charAt(i) - '0') * (b.charAt(k) - '0');
                res[i+k] += digit;
                res[i+k+1] += res[i+k] / 10;     
                res[i+k] = res[i+k] % 10;     
            }
        }
        int beg = res.length - 1;
        while(beg > 0 && res[beg] == 0)
        {
            beg--;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=beg;i>=0;i--)
        {
            sb.append(res[i]);
        }
        return sb.toString();
    }

}
