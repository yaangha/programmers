class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        //(1)
        /* 
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        } 
        */
        
        //(2)
        /*
        for(String a : arr) {
            answer += a;
        }
        */
        
        //(3)
        answer = String.join("", arr);
        
        return answer;
    }
}