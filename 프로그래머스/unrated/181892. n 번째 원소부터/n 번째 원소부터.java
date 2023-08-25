import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = Arrays.copyOfRange(num_list, n - 1, len);
        return answer;
    }
}