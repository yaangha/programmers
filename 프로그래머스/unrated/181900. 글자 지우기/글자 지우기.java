import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split("");
        
        for (int i : indices) {
            arr[i] = "";
        }
        
        String answer = Arrays.stream(arr).collect(Collectors.joining());
        
        return answer;
    }
}