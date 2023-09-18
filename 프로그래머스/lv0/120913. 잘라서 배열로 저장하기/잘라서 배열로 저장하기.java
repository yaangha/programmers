import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        String[] arr = my_str.split("");
        String str = "";
        
        for (int i = 0; i < arr.length; i++) {
            
            
            if (i == 0 || i % n != 0) {
                str += arr[i];
                
                if (i == arr.length-1) {
                    list.add(str);
                    break;
                }
            } else if (i % n == 0) {
                list.add(str);
                str = arr[i];
                if (i == arr.length-1) {
                    list.add(str);
                    break;
                }
            }
            
        }
        
        String[] answer = new String[list.size()];
        
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}