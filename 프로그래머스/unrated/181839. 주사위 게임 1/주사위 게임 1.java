class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if (a % 2 != 0 && b % 2 != 0) {
            answer = (int) (Math.pow(a, 2) + Math.pow(b, 2));
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        } else {
            answer = (a - b) >= 0 ? a - b : b - a;
        }
        
        return answer;
    }
}