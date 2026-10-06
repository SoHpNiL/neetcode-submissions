class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> kCount = new HashMap<>();
        List<Integer> keys = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (!keys.contains(nums[i])) {
                keys.add(nums[i]);
                kCount.put(currentNumber, 1);

            } else {
                kCount.put(currentNumber, kCount.get(currentNumber) + 1);
            }
        }

        int checks = k;
        int[] solution = new int[k];
        while (checks != 0) {
            int key = 0;
            int highestNum = 0;

            for (Integer x : keys) {
                if (kCount.get(x) > highestNum) {
                    highestNum = kCount.get(x);
                    key = x;
                }
            }
            solution[k - checks] = key;
            keys.remove((Integer) key);
            checks--;
        }

        return solution;
    }
}
