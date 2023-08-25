import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = IntStream.range(0, n).map(i -> num_list[i]).toArray();
        
        return answer;
    }
}