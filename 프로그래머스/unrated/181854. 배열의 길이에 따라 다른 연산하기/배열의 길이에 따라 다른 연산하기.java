class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
         int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            if (len % 2 == 0) {
                answer[i] = i % 2 == 0 ? arr[i] : arr[i] + n;
            } else {
                answer[i] = i % 2 == 0 ? arr[i] + n : arr[i];
            }
        }
        
        return answer;
    }
}