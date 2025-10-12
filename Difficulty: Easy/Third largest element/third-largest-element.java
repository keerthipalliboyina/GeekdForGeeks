import java.util.Arrays;

class Solution {
    int thirdLargest(int arr[]) {
        
        int n = arr.length;
        
        Arrays.sort(arr);
        
        if (n < 3) return -1;  
        return arr[n - 3];
    }
}
