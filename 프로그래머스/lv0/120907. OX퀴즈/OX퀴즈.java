import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();
        
        for (String s : quiz) {
            String[] arr = s.split(" ");
            int result = 0;
            if (s.contains("+")) {
                result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
            } else if (s.contains("-")) {
                result = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            }
            
            if (Integer.toString(result).equals(arr[4])) {
                list.add("O");
            } else {
                list.add("X");
            }
        }
        String[] answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}