class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int idx = 0;
        
        if (date1[idx] < date2[idx]) {
            answer = 1;
        } else if (date1[idx] == date2[idx]) {
            idx++;
            if (date1[idx] < date2[idx]) {
                answer = 1;
            } else if (date1[idx] == date2[idx]) {
                idx++;
                if (date1[idx] < date2[idx]) {
                    answer = 1;
                }
            }
        }
        
        return answer;
    }
}