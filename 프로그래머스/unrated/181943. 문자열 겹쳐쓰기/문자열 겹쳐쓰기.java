class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        //(1)
        /*
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s; i++) {
            sb.append(my_string.charAt(i));
        }
        
        sb.append(overwrite_string);
        
        if (overwrite_string.length() + s < my_string.length()) {
            for (int i = overwrite_string.length() + s; i < my_string.length(); i++) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
        */
        
        //(2)
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }
}