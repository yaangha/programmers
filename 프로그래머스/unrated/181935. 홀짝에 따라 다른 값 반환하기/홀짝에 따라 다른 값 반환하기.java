class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //(1) for 문을 굳이 1부터 돌리지 않아도 됨
        /*
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                if(i % 2 == 1) {
                    answer += i;   
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += i * i;   
                }
            }
        }
        */
        
        //(2) for문 수정
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i+=2) {
                answer += i;
            }
        } else {
            for (int i = 2; i <= n; i+=2) {
                answer += i * i;
            }
        }
        
        return answer;
    }
}