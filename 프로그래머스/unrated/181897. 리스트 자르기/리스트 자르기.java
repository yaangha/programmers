import java.util.Arrays.*;
import java.util.stream.*;
import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        if (n == 1) {
            return IntStream.rangeClosed(0, slicer[1]).map(i -> num_list[i]).toArray();
        } else if (n == 2) {
            return IntStream.rangeClosed(slicer[0], num_list.length - 1).map(i -> num_list[i]).toArray();
        } else if (n == 3) {
            return IntStream.rangeClosed(slicer[0], slicer[1]).map(i -> num_list[i]).toArray();
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = slicer[0]; i <= slicer[1]; i+=slicer[2]) {
                list.add(num_list[i]);
            }
            
            int[] answer = new int[list.size()];
            
            for (int j = 0; j < list.size(); j++) {
                answer[j] = list.get(j);
            }
            
            return answer;
        }
    }
}