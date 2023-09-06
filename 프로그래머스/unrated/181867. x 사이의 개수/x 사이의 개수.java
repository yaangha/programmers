import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("");
        List<Integer> list = new ArrayList<>();
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i].equals("x")) {
                list.add(count);
                count = 0;
                
                if (i == arr.length - 1) {
                    list.add(count);
                }
            } else {
                count++;
                
                if (i == arr.length - 1) {
                    list.add(count);
                }
            }
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}