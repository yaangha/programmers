class Solution {
    public String solution(String my_string, int k) {
        if(my_string.length() >= 1 && my_string.length() <= 100
          && k >= 1 && k <= 100) {
            return my_string.repeat(k);
        }
        return "";
    }
}