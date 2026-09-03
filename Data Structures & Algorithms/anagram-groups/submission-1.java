class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // input is a list of strings
        // return should be a list of sublists of anagrams grouped together
        // how do we figure out if some are anagrams?
        // count the letters in each string, and compare by char
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            // this loop iterates each string in the List
            char[] charSort = strs[i].toCharArray();
            Arrays.sort(charSort);
            String key = Arrays.toString(charSort);
            List<String> list = new ArrayList<>();
            if(!map.containsKey(key)) {
                list.add(strs[i]);
                map.put(key, list);
                // if the map doesnt contain the key
                // then we have to intialize a new List
                // then add the key to that list along w the value
            } else {
                // if it does, then add the index to the list of that same key
                list = map.get(key);
                list.add(strs[i]);
            }
        }
        for(List<String> values : map.values()) {
            result.add(values);
        }
        return result;
    }
}
