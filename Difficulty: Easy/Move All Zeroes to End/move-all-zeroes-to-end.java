class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
        /*System.out.print("[");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            if(count<n-1)
                 System.out.print(',');
        }
        System.out.print("]");*/
    }
}