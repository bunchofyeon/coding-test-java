class Solution {
    public String solution(String my_string, int s, int e) {
        // substring()의 반환값은 String
        // String에는 reverse() 메서드가 없음
        // 따라서 StringBuilder로 변환 후 reverse() 사용해야 함
        // [정리] substring()은 StringBuilder에서 호출해도 String 반환
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder tmp = new StringBuilder(
            sb.substring(s, e+1)
        );
        tmp.reverse();
        sb.replace(s, e+1, tmp.toString());
        return sb.toString();
    
    }
}