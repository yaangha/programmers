import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = IntStream.range(0, num_list.length).filter(i -> i % n == 0).map(i -> num_list[i]).toArray();
        
        return answer;
    }
}