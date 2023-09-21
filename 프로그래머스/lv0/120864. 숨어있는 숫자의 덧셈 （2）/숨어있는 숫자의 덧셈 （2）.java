class Solution {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[a-zA-Z]", " ");
        
        int answer = 0;
        for (String s : str.split(" ")) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
       
        return answer;
    }
}