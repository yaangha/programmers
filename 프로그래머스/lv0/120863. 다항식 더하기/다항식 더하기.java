class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        
        int x = 0;
        int n = 0;
        for (String s : arr) {
            if (s.contains("x")) {
                if (s.equals("x")) {
                    x += 1;
                } else {
                    String del = s.replace("x", "");
                    x += Integer.parseInt(del);
                }
            } else if (!s.equals("+")) {
                n += Integer.parseInt(s);   
            }
        }
        
        if (n == 0) {
            if (x == 1) {
                return "x";
            } else {
                return x + "x";
            }
        } else if (x == 0) {
            return "" + n;
        } else {
            if (x == 1) {
                return "x + " + n;
            } else {
                return x + "x + " + n;
            }
        }
        
    }
}