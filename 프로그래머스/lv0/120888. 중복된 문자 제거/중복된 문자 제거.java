class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        
        for (String s : arr) {
            if (sb.indexOf(s) == -1) {
                sb.append(s);
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}