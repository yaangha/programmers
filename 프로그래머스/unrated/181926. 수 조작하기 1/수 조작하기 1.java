class Solution {
    public int solution(int n, String control) {
        int len = control.length();
        int[] num = new int[len];
        
        char [] ch = control.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if (ch[i] == 'w') {
                num[i] = 1;
            } else if (ch[i] == 's') {
                num[i] = -1;
            } else if (ch[i] == 'd') {
                num[i] = 10;
            } else {
                num[i] = -10;
            }
        }
        
        int total = 0;
        
        for (int a : num) {
            // total += a;
            n += a;
        }
        
        return n;
    }
}