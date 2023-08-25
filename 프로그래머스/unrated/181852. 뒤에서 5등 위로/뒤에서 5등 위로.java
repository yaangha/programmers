import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int len = num_list.length;
        
        int[] answer = IntStream.range(5, len).map(i -> num_list[i]).toArray();
        
        
        return answer;
    }
}