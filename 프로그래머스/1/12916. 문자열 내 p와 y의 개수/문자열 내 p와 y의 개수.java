class Solution {
    boolean solution(String s) {

        // String은 불변
        // 그래서 s.toLowerCase(); 만 하면 원본이 바뀌지 않음
        s = s.toLowerCase();
    
        int count_p = 0;
        int count_y = 0;
       
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p') {
                count_p++;
            } else if (s.charAt(i) == 'y') {
                count_y++;
            }
        }
        if (count_p == count_y) return true;
        else return false;
        // 아래처럼 더 간단하게 가능
        // return count_p == count_y;
    
        // return True;는 String도 boolean도 아님
        // True는 자바에 없는 값
        // boolean은 true, false만 사용 가능
        
    }
}