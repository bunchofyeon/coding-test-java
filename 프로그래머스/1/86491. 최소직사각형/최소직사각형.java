class Solution {

    public int solution(int[][] sizes) {

        int maxW = 0;
        int maxH = 0;

        for(int i = 0; i < sizes.length; i++) {

            int w = Math.min(sizes[i][0], sizes[i][1]);
            int h = Math.max(sizes[i][0], sizes[i][1]);

            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }

        return maxW * maxH;
    }
}

/*
class Solution {

    public int solution(int[][] sizes) {

        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {

            int w = sizes[i][0];
            int h = sizes[i][1];

            // 긴거는 긴거끼리, 짧은거는 짧은거끼리 모으기
            int big = Math.max(w, h);
            int small = Math.min(w, h);

            // 긴 쪽들 중 가장 큰 값 찾기
            maxWidth = Math.max(maxWidth, big);

            // 짧은 쪽들 중 가장 큰 값 찾기
            maxHeight = Math.max(maxHeight, small);
        }

        // 모든 명함이 들어가는 최소 크기
        return maxWidth * maxHeight;
    }
}
*/