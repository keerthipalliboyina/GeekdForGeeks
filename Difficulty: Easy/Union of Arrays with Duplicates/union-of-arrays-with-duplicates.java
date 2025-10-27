class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();

        for (int num : a) set.add(num);
        for (int num : b) set.add(num);

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list); 
        return list;
    }
}
