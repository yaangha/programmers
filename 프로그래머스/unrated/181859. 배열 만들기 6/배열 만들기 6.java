import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        
        while (i < arr.length) {
            if (stk.empty()) {
                stk.push(arr[i]);
                i++;
            } else if (stk.peek() == arr[i]) {
                stk.pop();
                i++;
            } else if (stk.peek() != arr[i]) {
                stk.push(arr[i]);
                i++;
            }
        }
        
        int stk_size = stk.size();
        
        if (stk_size == 0) {
            return new int[]{-1};
        } else {
            int[] answer = new int[stk_size];
            for (int j = 0; j < stk_size; j++) {
                answer[j] = stk.get(j);
            }
            return answer;
        }
    }
}