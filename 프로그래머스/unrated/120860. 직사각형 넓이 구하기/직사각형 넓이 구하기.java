class Solution {
    public int solution(int[][] dots) {
        int x = 0; // 가로
        int y = 0; // 세로
        
        int a = dots[0][0];
        
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length - 1; j++) {
                if (dots[i][0] == dots[j][0]) { // x값이 같을 때 
                    y = dots[i][1] > dots[j][1] ? dots[i][1] - dots[j][1] : dots[j][1] - dots[i][1];
                } else if (dots[i][1] == dots[j][1]) { // y값이 같을 때
                    x = dots[i][0] > dots[j][0] ? dots[i][0] - dots[j][0] : dots[j][0] - dots[i][0];
                }
            }    
        }
        
        int answer = x * y;
        return answer;
    }
}