import java.util.*;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        int ar1 = a.length;
        int ar2 = b.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ar1; i++) {
             map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        for (int i = 0; i < ar2; i++) {
           if (!map.containsKey(b[i]) || map.get(b[i]) == 0)  { 
                return false;
            }
             map.put(b[i], map.get(b[i]) - 1);
        }
        return true;
    }
}
