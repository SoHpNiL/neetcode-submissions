class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> knownValues = new HashMap<>();
        for (int n : nums){
            if (!knownValues.containsKey(n)){
                knownValues.put(n, n);
            } else {
                return true;

            }
        }

        return false;
    
    }
}