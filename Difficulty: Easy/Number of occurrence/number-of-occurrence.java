class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count=0;
        int n=arr.length;
        for(int num:arr)
        {
            if(num==target)
            {
                count++;
            }
        }
        return count;
    }
}
