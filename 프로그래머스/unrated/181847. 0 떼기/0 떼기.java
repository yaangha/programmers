class Solution {
    public String solution(String n_str) {
        String[] sp = n_str.split("");
        int idx = 0;
        
        for(int i = 0; i < sp.length; i++) {
            if (!sp[i].equals("0")) {
                idx = i;
                break;
            }
        }
        
        String answer = n_str.substring(idx);
        
        return answer;
    }
}