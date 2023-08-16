import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        
        String answer = Arrays.stream(arr)
            .map(String::toLowerCase)
            .sorted()
            .collect(Collectors.joining());
        
        return answer;
    }
}