import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : array) {
            map.put(i, 0);
        }
        
        int value = 0;
        for (int i : array) {
            value = map.get(i);
            value++;
            map.put(i, value);
        }
        
        int answer = 0;
        int num = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > num) {
                num = map.get(key);
                answer = key;
            } else if (map.get(key) == num) {
                answer = -1;
            }
        }
        
        return answer;
    }
}