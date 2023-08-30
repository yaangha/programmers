class Solution {
    public String solution(String cipher, int code) {
        String[] arr = cipher.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = code - 1; i < cipher.length(); i+=code) {
            sb.append(arr[i]);
        }
        String answer = sb.toString();
        return answer;
    }
}