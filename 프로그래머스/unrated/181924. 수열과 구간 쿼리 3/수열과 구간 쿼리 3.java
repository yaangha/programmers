class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int index_0 = queries[i][0];
            int index_1 = queries[i][1];
            
            int num = arr[index_0];
            arr[index_0] = arr[index_1];
            arr[index_1] = num;
        }
        
        return arr;
    }
}