class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            int test = num_list[i];
            for (;;) {
                if (test != 1) {
                    test = (test % 2 == 0) ? test / 2 : (test - 1) / 2;
                    answer++;
                } else {
                    break;
                }
            }
        }
        return answer;
    }
}