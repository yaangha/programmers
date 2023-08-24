class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for (String arr1 : s1) {
            for (String arr2 : s2) {
                if (arr1.equals(arr2)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}