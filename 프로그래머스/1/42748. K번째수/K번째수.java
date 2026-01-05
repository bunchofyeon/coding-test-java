import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int n = 0; n < commands.length; n++) {
            int i = commands[n][0]-1;
            int j = commands[n][1]-1;
            int k = commands[n][2]-1;
            
            int[] list = new int[j-i+1];
            for(int l = i; l <= j; l++) {
                list[l-i] = array[l];
            }
            Arrays.sort(list);
            answer[n] = list[k];
        }
        return answer;
    }
}