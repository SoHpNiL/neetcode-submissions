class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> kCount = new HashMap<>();

        // Storing integers by X many times they appear
        for (int i : nums) {
            kCount.put(i, kCount.getOrDefault(i, 0) + 1);
        }

        // Sorting/Retrieving k
        PriorityQueue<Integer> sorted =
            new PriorityQueue<>((a, b) -> kCount.get(a) - kCount.get(b));

        for (Integer x : kCount.keySet()) {
            sorted.add(x);

            if (sorted.size() > k) {
                sorted.poll();
            }
        }

        int[] solution = new int[k];
        for (int i = 0; i < k; i++) {
            solution[i] = sorted.poll();
        }
        return solution;
    }
}
