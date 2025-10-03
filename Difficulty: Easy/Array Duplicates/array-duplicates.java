class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer> freq=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int num:freq.keySet())
        {
            if (freq.get(num) > 1) 
                list.add(num);
        }
        return list;
    }
}