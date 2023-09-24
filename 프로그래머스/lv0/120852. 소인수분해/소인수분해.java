import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            while(n % i == 0) {
                if (list.indexOf(i) == -1) {
                    list.add(i);
                }
                n /= i;
            }
        }
        
        int[] answer = list.stream().mapToInt(v -> v).toArray();
        return answer;
    }
}