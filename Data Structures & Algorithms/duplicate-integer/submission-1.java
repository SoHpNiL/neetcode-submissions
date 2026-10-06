class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count = 0;
        for (int n : nums){
            for (int x : nums){
            if (n == x){
                count++;
            }

            if (count > 1){
                return true;
            }
            }

            count = 0;
        }

        return false;
    }
}