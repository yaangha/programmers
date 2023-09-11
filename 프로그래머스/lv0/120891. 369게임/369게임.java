class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = Integer.toString(order);
        
        for (String s : strOrder.split("")) {
            int i = Integer.parseInt(s);
            if (i % 3 == 0 && i != 0) {
                answer++;
            }
        }
        
        return answer;
    }
}