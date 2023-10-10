import java.lang.Math;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int newlen = 0;
        while(Math.pow(2, newlen) < len) {
            newlen++;
        }
        
        int[] answer = new int[(int) Math.pow(2, newlen)];
        
        for (int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}