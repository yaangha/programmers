import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> a = new ArrayList<>();
        
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                a.add(i);
            }
        }
        
        int[] answer = a.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}