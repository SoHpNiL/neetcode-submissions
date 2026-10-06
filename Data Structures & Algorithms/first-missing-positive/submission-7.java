class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        List<Integer> numsO = new ArrayList<>();
        int count = 0;
        // Reorganize list while adding to seen
        for (int n : nums){
            if (!seen.contains(n) & n > 0){
            numsO.add(n);
            seen.add(n);
            }

            count++;
        }

        if (!seen.contains(1)){
            return 1;
        }
        Collections.sort(numsO);
        for (int i = 0; i < numsO.size(); i++){
        if (numsO.get(i) > 0){
            if (!seen.contains(numsO.get(i)-1) & numsO.get(i) != 1){
                return numsO.get(i)-1;
            }
            else if (!seen.contains(numsO.get(i)+1)){
                return numsO.get(i)+1;
            }
        }
        }
        return -1; //error
    }
}