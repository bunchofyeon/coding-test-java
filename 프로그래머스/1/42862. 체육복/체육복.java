class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        // 처음에는 모든 학생이 체육복을 가지고 있다고 생각
        int answer = n;

        // 학생 번호를 1번부터 n번까지 그대로 쓰기 위해 n + 1 크기로 배열 생성
        // clothes[0]은 사용하지 않음
        int[] clothes = new int[n + 1];

        // 기본적으로 모든 학생은 체육복 1개를 가지고 있음
        for (int i = 1; i <= n; i++) {
            clothes[i] = 1;
        }

        // 도난당한 학생은 체육복 개수에서 1개 빼기
        for (int i = 0; i < lost.length; i++) {
            clothes[lost[i]]--;
        }

        // 여벌 체육복이 있는 학생은 체육복 개수에 1개 더하기
        for (int i = 0; i < reserve.length; i++) {
            clothes[reserve[i]]++;
        }

        // 1번 학생부터 n번 학생까지 확인
        for (int i = 1; i <= n; i++) {

            // 체육복이 0개인 학생만 빌려야 함
            if (clothes[i] == 0) {

                // 앞 번호 학생이 존재하는지 먼저 확인
                // 그리고 앞 번호 학생이 체육복을 2벌 가지고 있으면 빌릴 수 있음
                if (i - 1 >= 1 && clothes[i - 1] == 2) {
                    clothes[i]++;
                    clothes[i - 1]--;
                }

                // 뒤 번호 학생이 존재하는지 먼저 확인
                // 그리고 뒤 번호 학생이 체육복을 2벌 가지고 있으면 빌릴 수 있음
                else if (i + 1 <= n && clothes[i + 1] == 2) {
                    clothes[i]++;
                    clothes[i + 1]--;
                }

                // 앞뒤 학생이 없거나, 있어도 여벌이 없으면 못 빌림
                // 그래서 수업을 들을 수 있는 학생 수에서 1명 제외
                else {
                    answer--;
                }
            }
        }

        return answer;
    }
}