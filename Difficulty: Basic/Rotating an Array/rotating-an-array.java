// User function Template for Java

class Solution {
    void leftRotate(int arr[], int d) {
        // code here
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=d;i<n;i++)
        {
            list.add(arr[i]);
        }
        for(int i=0;i<d;i++)
        {
            list.add(arr[i]);
        }
        int[] res=new int[n];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
    }
}
