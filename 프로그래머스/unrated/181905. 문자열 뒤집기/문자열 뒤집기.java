class Solution {
    public String solution(String my_string, int s, int e) {
        if (s == e) {
            return my_string;
        } else {
            String start = my_string.substring(0, s);
            String end = my_string.substring(e + 1);
            
            String[] a = my_string.substring(s, e + 1).split("");
            StringBuilder sb = new StringBuilder();
            
            int len = a.length;
            for (int i = len - 1; i >= 0; i--) {
                sb.append(a[i]);
            }
            
            return start + sb.toString() + end;
        }
    }
}