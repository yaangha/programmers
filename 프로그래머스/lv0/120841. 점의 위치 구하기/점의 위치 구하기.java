class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int m = dot[0] * dot[1];
        
        if (m > 0){
            answer = dot[0] > 0 ? 1 : 3;
        } else {
            answer = dot[0] > 0 ? 4 : 2;
        }
        
        return answer;
    }
}