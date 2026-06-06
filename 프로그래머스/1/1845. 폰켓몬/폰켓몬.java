import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = (nums.length)/2;
        Set<Integer> set = new HashSet<>();
        for (int s : nums) {
            set.add(s);
        }
        if(n>=set.size()) {
            answer = set.size();
        } else {
            answer = n;
        }
        return answer;
    }
}