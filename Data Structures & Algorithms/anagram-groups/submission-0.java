class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // return groups of anagrams into sublists
        // we can impl a hashmap
        // if the set of chars matches a set of chars in the hashmap
        // add it to the sublist
        // if not, add to a new sublist
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);


            if(map.containsKey(sortedStr)){
                map.get(sortedStr).add(s);
            }else{
                List<String> subList = new ArrayList<>();
                subList.add(s);
                map.put(sortedStr, subList);
            }
        }
        return new ArrayList<>(map.values());
    }
}