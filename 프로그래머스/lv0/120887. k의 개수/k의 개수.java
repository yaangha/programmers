class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int a = i; a <= j; a++) {
            String strA = Integer.toString(a);
            String strK = Integer.toString(k);
            
            String[] arrA = strA.split("");
            
            for (String s : arrA) {
               if (s.contains(strK)) {
                   answer++;
               } 
            }
        }
        
        return answer;
    }
}