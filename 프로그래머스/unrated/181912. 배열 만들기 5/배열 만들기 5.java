import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] intArr = new int[intStrs.length];
        
        for (int i = 0; i < intStrs.length; i++) {
            intArr[i] = Integer.parseInt(intStrs[i].substring(s, s + l));
        }
        
        int[] answer = Arrays.stream(intArr).filter(v -> v > k).toArray();
        return answer;
    }
}