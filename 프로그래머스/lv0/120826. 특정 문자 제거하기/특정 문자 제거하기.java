class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        
        String[] arr = my_string.split("");
        
        for (String s : arr) {
            if (!s.equals(letter)) {
                sb.append(s);
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}