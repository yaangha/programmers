class Solution {
    public int solution(int[] num_list) {
        int a = 0;
        int b = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            a += num_list[i];
            b *= num_list[i];
        }
        
        //(1) if ~ else ~
        /*
        if (b < a * a) {
            return 1;
        } else {
            return 0;
        }
        */
        
        //(2) 삼항연산자
        return (b < a * a) ? 1 : 0;
    }
}