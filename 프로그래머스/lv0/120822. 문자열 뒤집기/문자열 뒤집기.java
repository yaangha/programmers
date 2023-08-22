class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        String[] arr = my_string.split("");
        for (int i = my_string.length() - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}