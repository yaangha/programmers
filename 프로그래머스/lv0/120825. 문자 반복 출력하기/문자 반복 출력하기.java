import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int n) {
        String[] str = my_string.split("");
        
        String answer = Arrays.stream(str).map(value -> value.repeat(n)).collect(Collectors.joining());
        
        return answer;
    }
}