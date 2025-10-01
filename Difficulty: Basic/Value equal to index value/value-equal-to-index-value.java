// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            if(i+1==nums.get(i))
            {
                list.add(nums.get(i));
            }
        }
        return list;
    }
}