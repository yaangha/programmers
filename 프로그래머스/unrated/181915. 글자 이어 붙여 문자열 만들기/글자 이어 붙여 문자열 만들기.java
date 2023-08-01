class Solution {
    public String solution(String my_string, int[] index_list) {
        char[] a = my_string.toCharArray();
        char [] b = new char[index_list.length];
        
        for (int i = 0; i < index_list.length; i++) {
            int c = index_list[i];
            b[i] = a[c];
        }
        
        String answer = new String(b);
        return answer;
    }
}