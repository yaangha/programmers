import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        int i = 0;
        while (i < arr.length) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size()-1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size()-1) >= arr[i]) {
                int lastIndex = stk.size()-1;
                stk.remove(lastIndex);
            }
        }
        
        return stk.stream().mapToInt(v -> v).toArray();
    }
}