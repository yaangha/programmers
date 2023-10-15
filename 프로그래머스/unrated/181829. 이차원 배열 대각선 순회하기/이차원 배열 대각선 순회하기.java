class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        for (int a = 0; a < board.length; a++) {
            for (int b = 0; b < board[0].length; b++) {
                if (a + b <= k) {
                    answer += board[a][b];
                }
            }
        }
        
        return answer;
    }
}