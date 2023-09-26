class Solution {
    public int solution(int[] sides) {        int a = sides[0];
        int b = sides[1];
        int longSides = (a > b) ? a : b;
        
        int ans = 0;
        // a - b 값보다 크고, 제일 큰 값보다 작거나 같은
        for (int i = 1; i <= longSides; i++) {
            if (Math.abs(a-b) < i) {
                ans++;
            }
        }
        
        // 가장 긴 변이 남은 두 수의 합보다 작아야 함
        for (int j = longSides+1; j < a + b; j++) {
            if (j < a + b) {
                ans++;
            }
        }
        
        int answer = 0;
        return ans;
    }
}