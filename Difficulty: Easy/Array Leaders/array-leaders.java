class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
      
        for(int i=0;i<n;i++)
        {
              boolean isLeader=true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    isLeader=false;
                }
            }
            if(isLeader)
            {
                res.add(arr[i]);
            }
        }
        return res;
    }
}
