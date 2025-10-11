class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
       int n=arr.length;
       int left=0;
       int total=0;
       for(int i=0;i<n;i++)
       {
           total=total+arr[i];
       }
       for(int i=0;i<n;i++)
       {
           if(left == total - left - arr[i])
           {
               return i;
           }
           left+=arr[i];
       }
       return -1;
    }
}
