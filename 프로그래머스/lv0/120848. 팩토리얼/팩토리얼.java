class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 1;
        
        for (;;) { 
            if (num > n) {
                break;
            } else {
                answer++;
                num *= answer;
            }
        }
        
                
        return answer - 1;
    }
}