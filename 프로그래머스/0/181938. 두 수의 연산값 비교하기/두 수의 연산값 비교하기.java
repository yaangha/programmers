class Solution {
    public int solution(int a, int b) {
        int resultA = Integer.parseInt(a + "" + b);
        int resultB = 2 * a * b; 
        
        if (resultA == resultB) return resultA;
        
        return resultA > resultB ? resultA : resultB;
    }
}