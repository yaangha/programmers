class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
                
        for (int j = 0; j < emergency.length; j++) {
            int test = emergency[j];
            
            for (int i : emergency) {
                if (test <= i) {
                    answer[j]++;
                }
            }
        }
        
        return answer;
    }
}