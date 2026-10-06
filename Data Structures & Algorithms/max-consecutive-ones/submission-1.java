class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mostCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                count++;
            }

            else {
                if(count > mostCount){
                    mostCount = count;
                }
                count = 0;
            }
        }


        if(count > mostCount){
                    mostCount = count;
                }
                
        return mostCount;
    }
}