class Solution {
    public int solution(int[] numList) {
        String even = "";
        String odd = "";
        for (int a : numList) {
            if (a % 2 == 0) {
                even += a;
            } else {
                odd += a;
            }
        }
        
        return Integer.parseInt(even) + Integer.parseInt(odd);
        
    }
}