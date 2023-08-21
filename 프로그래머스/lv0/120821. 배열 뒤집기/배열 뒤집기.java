import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        int idxs = num_list.length - 1;
        
        int[] answer = IntStream.range(0, idxs + 1).map(value -> num_list[idxs - value]).toArray();
        
        return answer;
    }
}