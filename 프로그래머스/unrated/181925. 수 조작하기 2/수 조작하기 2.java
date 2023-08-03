class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numLog.length - 1; i++) {
            int a = numLog[i + 1] - numLog[i];
            if (a == 1) {
                sb.append("w");
            } else if (a == -1) {
                sb.append("s");
            } else if (a == 10) {
                sb.append("d");
            } else {
                sb.append("a");
            }
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}