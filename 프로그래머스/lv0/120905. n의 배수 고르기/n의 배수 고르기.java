import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
        
        /*
        int idx = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                idx++;
            }
        }
        
        int[] answer = new int[idx];
        idx = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[idx] = numlist[i];
                idx++;
            }
        }
        */
        return answer;
    }
}