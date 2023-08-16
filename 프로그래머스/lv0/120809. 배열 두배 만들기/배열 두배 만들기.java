import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers).map(value -> value * 2).toArray();
        
        return answer;
    }
}