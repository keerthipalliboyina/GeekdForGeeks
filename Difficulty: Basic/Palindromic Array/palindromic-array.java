/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(!ispalin(arr[i]))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean ispalin(int n)
    {
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}