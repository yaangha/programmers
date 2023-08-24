import java.util.stream.IntStream;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String s2 = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = s2.split("");
        
        answer = IntStream.range(0, arr.length).map(value -> Integer.parseInt(arr[value])).sum();
        
        return answer;
    }
}