import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Check if second smallest exists
        if (secondSmallest == Integer.MAX_VALUE) {
            result.add(-1);
        } else {
            result.add(smallest);
            result.add(secondSmallest);
        }

        return result;
    }
}
