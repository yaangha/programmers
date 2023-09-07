import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        int multi = 1; 
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                multi = numbers[i] * numbers[j];
                list.add(multi);
            }
        }
        
        Collections.sort(list);
        
        int answer = list.get(list.size() - 1);
        return answer;
    }
}