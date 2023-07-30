class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer;
        
        int total = 0;
        for (boolean b : finished) {
            if (b == false) {
                total++;
            }
        }
        
        answer = new String[total];
        
        int k = 0;
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                answer[k] = todo_list[i];
                k++;
            }
        }
        
        
        
        
        return answer;
    }
}