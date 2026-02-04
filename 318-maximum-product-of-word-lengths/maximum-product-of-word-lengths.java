class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int masks[] = new int[n];
        int lengths[] = new int[n];
        for(int i=0;i<n;i++)
        {
            int mask = 0;
            for(char c : words[i].toCharArray())
            {
                mask |= 1<<(c-'a');
            }
            masks[i] = mask;
            lengths[i] = words[i].length();
        }
        int maxProduct = 0;
        for(int i=0;i<n;i++)
        {
            for(int k=i+1;k<n;k++)
            {
                if((masks[i] & masks[k]) == 0)
                {
                    int product = lengths[i] * lengths[k];
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }
        return maxProduct;
    }
}