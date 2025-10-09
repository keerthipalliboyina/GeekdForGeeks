class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        int al=a.length;
        int bl=b.length;
        if(al!=bl)
        {
            return false;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:a){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:b)
        {
            if(!map.containsKey(num))
            {
                return false;
            }
            map.put(num,map.get(num)-1);
            if(map.get(num)==0)
            {
                map.remove(num);
            }
        }
        return map.isEmpty();
    }
}