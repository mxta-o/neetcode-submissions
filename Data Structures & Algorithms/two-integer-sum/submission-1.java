class Solution {
    public int[] twoSum(int[] nums, int target) {
        // how can i employ a hashmap?
        // key value pairs, allows immediate look up
        // use the hashmap to store every value of the array
        // we will use target - nums[i] to find the second number that forms the sum
        HashMap<Integer, Integer> set = new HashMap<>();
        int[] result = new int[2];
        // the key will be the value of the index in the array,
        // while the value of the key will be the index OF the element in the array.

        for(int i = 0; i < nums.length; i++) {
            int secondInt = target - nums[i];
            if(!set.containsKey(secondInt)) {
                set.put(nums[i], i);
            }else{
                result[1] = i;
                result[0] = set.get(secondInt);
            }
        }
        return result;
        
    }
}
