import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int len = array.length;
        Arrays.sort(array);
        
        int answer = array[len / 2];
        
        return answer;
    }
}