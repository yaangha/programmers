class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        String[] arr = myString.split("");
        
        for (String s : arr) {
            if (s.equals("A")) {
                sb.append("B");
            } else {
                sb.append("A");
            }
        }
        
        String change = sb.toString();
        
        int answer = change.contains(pat) ? 1 : 0;
        
        
        return answer;
    }
}