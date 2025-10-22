
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int n=arr.length;
        int mid=n/2;
        int count=0;
        for(int i=0;i<mid;i++)
        {
            if(arr[i]==arr[n-1-i])
            {
                count++;
            }
            
        }
        if(count==mid)
        {
            return true;
        }
        return false;
    }
}
