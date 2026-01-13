class Solution {
    private int gcd(int a, int b)
    {
         if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public String fractionAddition(String expr) {
        int nume = 0;
        int deno = 1;
        int n = expr.length();
        int i = 0;
        while(i<n)
        {
            int currNume = 0;
            int currDeno = 0;
            //char ch = expr.charAt(i);
            boolean isNeg = ( expr.charAt(i) == '-');
            if(expr.charAt(i) == '+' || expr.charAt(i) == '-')
                i++;
            while(i<n && Character.isDigit(expr.charAt(i)))
            {
                int val = expr.charAt(i) - '0';
                currNume = (currNume*10) + val;
                i++;
            }
            i++;
            if(isNeg == true)
                currNume *= -1;
            while(i<n && Character.isDigit(expr.charAt(i)))
            {
                int val = expr.charAt(i)- '0';
                currDeno = (currDeno * 10) + val;
                i++;
            }
            nume = (currNume * deno) + (currDeno * nume);
            deno = (currDeno * deno);
        }
        int GCD = Math.abs(gcd(nume,deno));
        nume /= GCD;
        deno /= GCD;
        return Integer.toString(nume) + "/" + Integer.toString(deno);
    }
}