class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<> ();
        for(int i=0;i<n;i++)
        {
            if(((i+1)%3 == 0) && ((i+1)%5 == 0))
            {
                result.add(i, "FizzBuzz");
            }
            else if((i+1)%3 == 0)
            {
                result.add(i, "Fizz");
            }
            else if((i+1)%5 == 0)
            {
                result.add(i, "Buzz");
            }
            else
            {
                result.add(i, Integer.toString(i+1));
            }
        }
        return result;
    }
}