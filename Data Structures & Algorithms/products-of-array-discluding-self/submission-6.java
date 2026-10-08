class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        List<Integer> z = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z.add(i);
                continue;
            }
            sum = sum * nums[i];
        }

        int[] result = new int[nums.length];
        if (z.isEmpty()) {
            for (int j = 0; j < nums.length; j++) {
                result[j] = sum / nums[j];
            }
        }

        else if (z.size() == 1) {
            result[z.get(0)] = sum;
        }

        return result;
    }
}