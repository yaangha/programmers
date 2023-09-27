class Solution {
    public String solution(String my_string, int m, int c) {
        int len = my_string.length();
        String[] arr = new String[len/m];
        
        int index = 0;
        for (int i = 0; i < len; i+=m) {
            arr[index] = my_string.substring(i, i+m);
            index++;
        }
                
        char[] charArr = new char[len/m];
        for (int j = 0; j < charArr.length; j++) {
            charArr[j] = arr[j].charAt(c-1);
        }
        
        String answer = new String(charArr);
        return answer;
    }
}