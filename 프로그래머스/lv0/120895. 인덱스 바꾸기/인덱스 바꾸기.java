class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        char s1 = arr[num1];
        char s2 = arr[num2];
        
        arr[num1] = s2;
        arr[num2] = s1;
        
        String answer = new String(arr);
        return answer;
    }
}