// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev=0;
        while(n!=0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
}