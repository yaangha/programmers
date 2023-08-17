class Solution {
    public double solution(int[] numbers) {
        int total = 0;
        
        for (int i : numbers) {
            total += i;
        }
        
        double answer = total * 1.0 / numbers.length;
        return answer;
    }
}