import java.util.*;

class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        
        String[] array = s.split("");
        Arrays.sort(array);
        int count = 1;
        for (String str : array) {
            if (map.containsKey(str)) {
                int a = map.get(str);
                map.replace(str, ++a);
            } else {
                map.put(str, count);
            }
        }
        
        String[] valueArray = new String[map.size()];
        int index = 0;
        for (String key : map.keySet()) {
            valueArray[index] = key;
            index++;
        }
        
        Arrays.sort(valueArray);
        
        String a = "";
        
        for (String va : valueArray) {
            a += va;
        }
        
        String answer = "";
        
        for (String key : valueArray) {
            if (map.get(key) == 1) {
                answer += key;
            }
        }
        
        return answer;
    }
}