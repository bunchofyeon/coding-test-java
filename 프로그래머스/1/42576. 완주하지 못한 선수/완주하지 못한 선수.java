import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> hash = new HashMap<>();

        for(String str : participant) {
            hash.put(str, hash.getOrDefault(str, 0) + 1);
        }

        for(String str : completion) {
            hash.put(str, hash.getOrDefault(str, 0) - 1);
        }

        for(String key : hash.keySet()) {
            if(hash.get(key) > 0) {
                return key;
            }
        }

        return "";
    }
}