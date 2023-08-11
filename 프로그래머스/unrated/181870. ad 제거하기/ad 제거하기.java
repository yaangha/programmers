class Solution {
    public String[] solution(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            if(!s.contains("ad")) {
                sb.append(s + "-");
            }
        }
        
        String[] answer = sb.toString().split("-");
        return answer;
    }
}