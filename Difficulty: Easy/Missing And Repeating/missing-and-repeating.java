class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int missing=-1;
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1;i<n;i++)
        {
           if( arr[i]==arr[i-1])
           {
               list.add(arr[i]);
               break;
           }
        }
        for (int i = 1; i <= n; i++) {
            if (Arrays.binarySearch(arr, i) < 0) { 
                missing = i;
                break;
            }
        }
        list.add(missing);
        return list;
        
    }
}
