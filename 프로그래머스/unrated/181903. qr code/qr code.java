class Solution {
    public String solution(int q, int r, String code) {
        String[] arr = code.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            if (i % q == r) {
                sb.append(arr[i]);
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}