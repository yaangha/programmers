class Solution {
    public int solution(int num, int k) {
        String[] arr = Integer.toString(num).split("");
        String strK = Integer.toString(k);
        
        int answer = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(strK)) {
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}