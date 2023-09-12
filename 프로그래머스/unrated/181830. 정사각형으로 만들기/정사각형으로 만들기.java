class Solution {
    public int[][] solution(int[][] arr) {
        int width = arr[0].length;
        int height = arr.length;
        int len = (width >= height) ? width : height; 
        System.out.print(width + ", " + height + ", " + len);
        int[][] answer = new int[len][len];
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i >= height) {
                    answer[i][j] = 0;
                } else if (j >= width) {
                    answer[i][j] = 0;
                } else {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        
        return answer;
    }
}