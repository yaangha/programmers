class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer1 = true;
        boolean answer2 = true;
        
        if (x1 == x2) {
            if (x1) {
                answer1 = true;
            } else {
                answer1 = false;
            }
        } else {
            answer1 = true;
        }
        
        if (x3 == x4) {
            if (x3) {
                answer2 = true;
            } else {
                answer2 = false;
            }
        } else {
            answer2 = true;
        }
        
        boolean answer = false;
        
        if (answer1 == answer2) {
            if (answer1) {
                answer = true;
            }
        } else {
            answer = false;
        }
        
        return answer;
    }
}