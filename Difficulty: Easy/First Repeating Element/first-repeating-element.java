import java.util.*;

class Solution {
    public static int firstRepeated(int[] arr) {
        Map<Integer, Integer> firstIndexMap = new HashMap<>();
        int minIndex = arr.length; 
        for (int i = 0; i < arr.length; i++) {
            if (firstIndexMap.containsKey(arr[i])) {
         
                if (firstIndexMap.get(arr[i]) < minIndex) {
                    minIndex = firstIndexMap.get(arr[i]);
                }
            } else {
                firstIndexMap.put(arr[i], i);
            }
        }

        if (minIndex == arr.length) {
            return -1;
        } else {
            return minIndex + 1; 
        }
    }

}