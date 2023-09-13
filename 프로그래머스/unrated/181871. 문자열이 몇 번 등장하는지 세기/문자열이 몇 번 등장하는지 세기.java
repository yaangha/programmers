class Solution {
    public int solution(String myString, String pat) {
        int len = pat.length();
        int answer = 0;
        
        for (int i = 0; i < myString.length() - len + 1; i++) {
            String sub = myString.substring(i, i + len);
            if (pat.equals(sub)) {
                answer++;
            }
        }
        
        return answer;
    }
}