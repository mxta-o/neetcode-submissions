

class Solution {
    public boolean hasDuplicate(int[] nums) {
        // deploy a hashmap
        // create a hashset that accounts for every variable iterated throughout the set
        HashSet<Integer> seen = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;

    }
}