import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("");
        String str = "";
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("a") || arr[i].equals("b") || arr[i].equals("c")) {
                if (!str.equals("")) {
                    list.add(str);
                    str = "";
                }
            } else {
                str += arr[i];
                if (i == arr.length-1) {
                    list.add(str);
                }
            }
        }
        
        if (list.size() > 0) {
            String[] answer = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        } else {
            return new String[]{"EMPTY"};
        }
    }
}