class Solution {
    public int[] solution(int num, int total) {
        int sum = 0;
        
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        
        int n1 = (total - sum) / num;
        int[] answer = new int[num];
        
        for (int j = 0; j < num; j++) {
            answer[j] = n1;
            n1++;
        }
        
        return answer;
    }
}