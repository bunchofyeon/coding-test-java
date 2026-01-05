import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int n = 0; n < commands.length; n++) {
            
            int[] list = Arrays.copyOfRange(array, commands[n][0]-1, commands[n][1]);
            Arrays.sort(list);
            answer[n] = list[commands[n][2]-1];

        }
        return answer;
    }
}

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int n = 0; n < commands.length; n++) {
            
            int[] list = Arrays.copyOfRange(array, commands[n][0]-1, commands[n][1]);
            Arrays.sort(list);
            answer[n] = list[commands[n][2]-1];

        }
        return answer;
    }
}

/*
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int n=0;n<commands.length;n++){
            int i = commands[n][0]-1;
            int j = commands[n][1]-1;
            int k = commands[n][2]-1;
            
            int[] arr = new int[j-i+1];
            
            for(int t=i;t<=j;t++){
                arr[t-i]=array[t];
            }
            Arrays.sort(arr);
            
            answer[n]=arr[k];
        }
        
        
        return answer;
    }
}
*/
