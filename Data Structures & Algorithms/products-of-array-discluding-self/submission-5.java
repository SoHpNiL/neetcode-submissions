class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int max = nums.length; 
        List<Integer> z = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            if (nums[i] == 0) {
                z.add(i);
                continue;
            }
            sum = sum * nums[i];
        }

        int[] result = new int[max];
        if (z.isEmpty()) {
            for (int j = 0; j < max; j++) {
                result[j] = sum / nums[j];
            }
        }

        else if (z.size() == 1) {
            result[z.get(0)] = sum;
        }

        return result;
    }
}