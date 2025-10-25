class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i==k-1)
            {
                return arr[i];
            }
        }
        return -1;
    }
}
