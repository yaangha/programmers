import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = Arrays.stream(strlist).mapToInt(value -> value.length()).toArray();
        
        return answer;
    }
}