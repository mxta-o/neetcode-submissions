class Solution {
    public boolean isAnagram(String s, String t) {
        // also declare a hashmap
        // if the letters in t appear in letters of s
        // return true
        // edge case
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }

        // while counting s, store count per char read
        // for each letter in str s:
        //      store index in hashmap
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // if existing char exists in hashmap, increase count
            // if not, create a new key
            if(sMap.containsKey(c)) {
                // increase count
                sMap.put(c, sMap.get(c) + 1);
                } else {
                    sMap.put(c, 1);
                }
            }

        // while coutning t, store count per char read
        //  for each letter in t:
        //       store index in hashmap
        for(int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            if(tMap.containsKey(c)) {
                tMap.put(c, tMap.get(c) + 1);
            } else {
                tMap.put(c, 1);
            }
        }

        // if the two hashmaps are identical, return true
        // else return false
        return sMap.equals(tMap);
    }
}

