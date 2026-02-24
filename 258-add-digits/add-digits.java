class Solution {
    public int addDigits(int num) {
        int a,d;
        a=num;
        int sum=0;
        while(a/10 != 0)
        {
            sum=0;
            while(a>0)
            {
                d=a%10;
                sum=sum+d;   
                a=a/10;
            }
            a=sum;  
        }
    return a;
    }
}