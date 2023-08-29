class Solution {
    public String solution(String rsp) {
        String[] arr = rsp.split("");
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            if (s.equals("2")) {
                sb.append("0");
            } else if (s.equals("0")) {
                sb.append("5");
            } else {
                sb.append("2");
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}