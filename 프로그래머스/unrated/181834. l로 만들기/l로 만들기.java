class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        char[] arr = myString.toCharArray();
        
        for (char s : arr) {
            if (s < 'l') {
                sb.append("l");
            } else {
                sb.append(Character.toString(s));
            }
        }
        
        return sb.toString();
    }
}