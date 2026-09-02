class Solution {
    public boolean hasDuplicate(int[] nums) {
        //impl hashmap, iterate through loop, if idx is found in hashmap, return true
        Set<Integer> seen = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
}