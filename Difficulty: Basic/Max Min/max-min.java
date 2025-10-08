// User function Template for Java

class Solution {
    public static int findSum(int A[], int N) {
        // code here
       int min = A[0], max = A[0];
for(int i = 1; i < N; i++) {
    if(A[i] < min) min = A[i];
    if(A[i] > max) max = A[i];
}
return min + max;

    }
}
