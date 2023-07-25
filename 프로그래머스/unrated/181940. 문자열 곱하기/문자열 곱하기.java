class Solution {
    public String solution(String my_string, int k) {
        //(1) repeat() 사용
        // return my_string.repeat(k);
        
        //(2) StringBuilder 사용(toString()으로 타입 변환 필요)
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }
}