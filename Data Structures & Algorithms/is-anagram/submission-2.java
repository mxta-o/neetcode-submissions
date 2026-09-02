class Solution {
    public boolean isAnagram(String s, String t) {
        // deploy a hashmap
        // if the character in the array is new,
        // store it as a new key in the hashmap
        // increase the count by 1
        HashMap<Character, Integer> chars = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            if(!chars.containsKey(s.charAt(i))) {
                // initialize key and add count by 1
                chars.put(s.charAt(i), 1);
            }else {
                // else statemnet would mean it does already exist as key, so increment one
                chars.put(s.charAt(i), chars.get(s.charAt(i)) + 1);
            }

        }

        for(int j = 0; j < t.length(); j++) {
            if(!chars.containsKey(t.charAt(j))) {
                return false;
            }
            chars.put(t.charAt(j), chars.get(t.charAt(j)) - 1);
        }
        for(int value : chars.values()) {
            if(value != 0) {
                return false;
            }
        }
        return true;

    }
}
