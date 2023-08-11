class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        
        String[] arr = myString.split("");
        
        for (String s : arr) {
            if (s.equals("a") || s.equals("A")) {
                answer.append(s.toUpperCase());
            } else {
                answer.append(s.toLowerCase());
            }
        }
        
        return answer.toString();
    }
}