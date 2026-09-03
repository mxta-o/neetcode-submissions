class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // nums is the array of nums
        // k is the number of most frequent elements
        // initialize a hashmap of integers, where the key is the num, and the value is the count
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.merge(nums[i], 1, Integer::sum);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        for(int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }    
        return result;
    }
}
