class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] arr = my_string.toCharArray();

        int index = 0;
        for (char value = 'A'; value <= 'Z'; value++) {
            for (char c : arr) {
                if (c == value) {
                    answer[index]++;
                }
            }
            index++;
        }
        
        for (char value = 'a'; value <= 'z'; value++) {
            for (char c : arr) {
                if (c == value) {
                    answer[index]++;
                }
            }
            index++;
        }
        
        return answer;
    }
}