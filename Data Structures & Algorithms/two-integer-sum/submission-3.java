class Solution {
    public int[] twoSum(int[] nums, int target) {
        int targetValue;

        HashMap<Integer, Integer> pos = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            pos.put(nums[i], i);
        }

        
        for (int i = 0; i < nums.length; i++) {
            targetValue = target - nums[i];
            int y = pos.getOrDefault(targetValue, -1);

            if ( y != -1 && y != i){
                int[] ans = new int[]{i,y};
                return ans;
            }
        }
        int[] ans = new int[]{-1,-1};
                return ans;

    }
}
