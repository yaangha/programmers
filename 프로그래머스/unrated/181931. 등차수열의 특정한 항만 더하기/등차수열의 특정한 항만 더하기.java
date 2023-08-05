class Solution {
    public int solution(int a, int d, boolean[] included) {
        int len = included.length;
        
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (included[i]) {
                sum += a + (d * i);
            } else {
                sum += 0;
            }
        }
        return sum;
    }
}